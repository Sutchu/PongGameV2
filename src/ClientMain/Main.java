package ClientMain;

import Packets.SenderPacket;
import view.MainFrame;
import view.MainPanel;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Main {

    private Socket socket;
    private InputStream inputStream;
    private ObjectInputStream objectInputStream;
    private MainFrame mainFrame;
    private MainPanel mainPanel;

    public Main() {
        mainFrame = new MainFrame();
        mainPanel = new MainPanel();
        mainFrame.add(mainPanel);
        mainFrame.initProperties();

        try {
            socket = new Socket("localhost",6666);
            inputStream = socket.getInputStream();
            objectInputStream = new ObjectInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Connected!");
        startThread();



    }

    private void startThread() {
        Timer timer = new Timer(10, e -> {
            try {
                SenderPacket senderPacket = (SenderPacket) objectInputStream.readObject();
                mainPanel.updateSenderPacket(senderPacket);
            } catch (Exception ex) {
                System.out.println("issue with server");
            }
            mainFrame.repaint();

        });

        timer.start();
    }

    public static void main(String[] args){
        new Main();

    }
}
