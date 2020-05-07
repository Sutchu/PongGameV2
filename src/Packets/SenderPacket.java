package Packets;

import java.io.Serializable;

public class SenderPacket implements Serializable {
    public int ballX, ballY, paddle1X, paddle1Y, paddle2X, paddle2Y;

    public SenderPacket(int ballX, int ballY, int paddle1X, int paddle1Y, int paddle2X, int paddle2Y) {
        this.ballX = ballX;
        this.ballY = ballY;
        this.paddle1X = paddle1X;
        this.paddle1Y = paddle1Y;
        this.paddle2X = paddle2X;
        this.paddle2Y = paddle2Y;
    }
}
