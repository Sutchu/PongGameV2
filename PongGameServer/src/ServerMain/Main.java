package ServerMain;

import controller.Controller;

import javax.swing.Timer;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {

    private final int PORT = 6666;
    private ArrayList<ClientThread> clients;

    private Main() {
        clients = new ArrayList();
        startServer();
    }


    public void startServer() {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e){}


            if (clients.size() <= 2) {
                try {
                    socket = serverSocket.accept();
                } catch (IOException e) {
                    System.out.println("I/O error: " + e);
                }
                // new thread for a client
                clients.add(new ClientThread(socket));
                if (clients.size() == 2) {
                    startGameThread();
                }
            }
        }
    }

    private void startGameThread() {
        Timer timer = new Timer(10, e -> {
            Controller.getInstance().updateGame();
            clients.forEach(clientThread -> clientThread.update());
        });

        timer.start();
    }


    public static void main(String args[]) {
        new Main();
    }
}
