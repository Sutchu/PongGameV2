package ServerMain;

import Model.Object.Ball;
import Model.Object.Paddle;
import Packets.SenderPacket;
import controller.Controller;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientThread extends Thread {
    private Socket socket;
    private InputStream inputStream;
    private ObjectInputStream objectInputStream;
    private OutputStream outputStream;
    private ObjectOutputStream objectOutputStream;

    public ClientThread(Socket socket) {
        this.socket = socket;

        try {
            // get the (input/output) stream from the connected socket
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
            // create a Data(Input/Output)Stream so we can read data from it.
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectInputStream = new ObjectInputStream(inputStream);

        } catch (IOException e) {
            return;
        }
        System.out.println("A player is connected!");
    }

    public void update() {
        try {
            objectOutputStream.writeObject(createSenderpacket());
            Controller.getInstance().pressedButtons((ArrayList<String>) objectInputStream.readObject());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private SenderPacket createSenderpacket() {
        Ball ball = Controller.getInstance().getBall();
        ArrayList<Paddle> paddles = Controller.getInstance().getPaddles();
        return new SenderPacket(ball.getX(), ball.getY(), paddles.get(0).getX(), paddles.get(0).getY(), paddles.get(1).getX(), paddles.get(1).getY());
    }
}
