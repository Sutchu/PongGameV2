package ClientMain;

import Controller.Controller;
import Model.Vector2D;
import view.MainFrame;
import javax.swing.*;
import java.io.*;
import java.net.Socket;

public class Main {
    private Socket socket;
    private InputStream inputStream;
    private ObjectInputStream objectInputStream;
    private OutputStream outputStream;
    private ObjectOutputStream objectOutputStream;
    private MainFrame mainFrame;
    private int[] inputData;

    Timer gameThread;
    Timer timer;

    public Main() {
        mainFrame = new MainFrame(); /**Initializes frame*/

        inputData = new int[9];
        connectToServer();
        initThreads();
    }

    private void connectToServer() {
        try {
            socket = new Socket("35.234.124.95",6666);  /**Connects client and server*/
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
        gameThread = new Timer(33, e -> {
            mainFrame.repaint(); /**repaints panel's objects*/
        });

        timer = new Timer(10, e -> {
            try {
                inputData = (int[]) objectInputStream.readObject(); /**This class' SenderPacket is updated with server's.*/
                decodeServerData(inputData);

                //objectOutputStream.writeObject(mainFrame.getPressedKeys());
            } catch (Exception ex) {
                System.out.println("issue with server");
            }
        });

    }

    private void decodeServerData(int[] data) {
        switch (data[0]) {
            case 0:
                // Only update Velocities
                Controller.getInstance().updateVelocities(new Vector2D(data[1], data[2]),
                        new Vector2D(data[3], 0),
                        new Vector2D(data[4], 0));
            case 1:
                // Update Positions and Velocities
                Controller.getInstance().updatePositions(new Vector2D(data[5], data[6]),
                        new Vector2D(data[7], 0),
                        new Vector2D(data[8], 0));
                break;
        }
    }

    public static void main(String[] args){
        new Main();
    }
}
