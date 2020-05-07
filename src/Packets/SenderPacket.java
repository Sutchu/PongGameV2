package Packets;

import java.io.Serializable;

public class SenderPacket implements Serializable {
    public int ballX;
    public int ballY;

    public SenderPacket(int ballX, int ballY) {
        this.ballX = ballX;
        this.ballY = ballY;
    }
}
