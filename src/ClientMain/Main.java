package ClientMain;

import Packets.SenderPacket;
import view.MainFrame;
import view.MainPanel;

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
    private MainPanel mainPanel;
    private SenderPacket senderPacket;

    public Main() {
        mainFrame = new MainFrame(); /**Initializes frame*/
        mainPanel = new MainPanel(); /**Initializes panel and prepares it*/
        mainFrame.add(mainPanel); /**Adds panel to frame*/
        mainFrame.initProperties(); /**Adjusts frame's features and activates it*/

        try {
            socket = new Socket("35.234.124.95",6666);  /**Connects client and server*/
            inputStream = socket.getInputStream();              /**InputStream gets a serverInputStream, or something like that. Whatever.*/
            objectInputStream = new ObjectInputStream(inputStream); /**Initialization an input stream to be able to get the class sent from sever*/

            outputStream = socket.getOutputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Connected!");
        startThread();  /**Starts the loop*/

    }

    /**
     * The loop which gets data from server and updates panel
     */
    private void startThread() {
        Timer timer = new Timer(10, e -> {
            try {
                senderPacket = (SenderPacket) objectInputStream.readObject(); /**This class' SenderPacket is updated with server's.*/
                mainPanel.updateSenderPacket(senderPacket); /**sends this class's SenderPacket to panel to update data*/

                objectOutputStream.writeObject(mainFrame.getPressedKeys());
            } catch (Exception ex) {
                System.out.println("issue with server");
            }
            mainFrame.repaint(); /**repaints panel's objects*/

        });

        timer.start();
    }

    public static void main(String[] args){
        new Main();

    }
}
