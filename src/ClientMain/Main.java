package ClientMain;

import Controller.Controller;
import Model.Vector2D;
import view.MainFrame;
import java.io.*;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private Socket socket;
    private InputStream inputStream;
    private ObjectInputStream objectInputStream;
    private OutputStream outputStream;
    private ObjectOutputStream objectOutputStream;
    private MainFrame mainFrame;
    private int[] inputData;

    public Main() {
        mainFrame = new MainFrame(); /**Initializes frame*/

        inputData = new int[9];
        connectToServer();
        initThreads();
    }

    private void connectToServer() {
        try {
            socket = new Socket("localhost",6666);  /**Connects client and server*/
            inputStream = socket.getInputStream();              /**InputStream gets a serverInputStream, or something like that. Whatever.*/
            objectInputStream = new ObjectInputStream(inputStream); /**Initialization an input stream to be able to get the class sent from sever*/

            outputStream = socket.getOutputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);
            System.out.println("Connected!");
        } catch (IOException e) {
            System.out.println("Connection failed, terminating!");
            System.exit(0);
        }
    }

    /**
     * The loop which gets data from server and updates panel
     */
    private void initThreads() {

        TimerTask serverListenerThread = new TimerTask() {
            @Override
            public void run() {
                try {
                    inputData = (int[]) objectInputStream.readObject(); /**This class' SenderPacket is updated with server's.*/
                    decodeServerData(inputData);

                    //objectOutputStream.writeObject(mainFrame.getPressedKeys());
                } catch (Exception ex) {
                    System.out.println("issue with server");
                }
            }
        };

        Timer timer = new Timer("MyTimer");//create a new Timer
        timer.scheduleAtFixedRate(serverListenerThread, 1, 10);


        TimerTask gameThread = new TimerTask() {
            @Override
            public void run() {
                mainFrame.repaint();
            }
        };

        Timer timer2 = new Timer("MyTimer");//create a new Timer
        timer2.scheduleAtFixedRate(gameThread, 33, 10);

    }

    private void decodeServerData(int[] data) {
        switch (data[0]) {
            case 1:
                // Only update Velocities
                Controller.getInstance().updateVelocities(new Vector2D(data[1], data[2]),
                        new Vector2D(data[3], 0),
                        new Vector2D(data[4], 0));
            case 0:
                // Update Positions and Velocities
                Controller.getInstance().updatePositions(new Vector2D(data[5], data[6]),
                        new Vector2D(data[7], 595),
                        new Vector2D(data[8], 0));
                break;
        }
    }

    public void updateServer(byte[] pressedKeys) {
        try {
            objectOutputStream.writeObject(pressedKeys);
        } catch (Exception e) {
            System.err.println("Couldn't send pressedKeys to server");
        }
    }

    public static void main(String[] args){
        new Main();
    }
}
