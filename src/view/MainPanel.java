package view;

import Packets.SenderPacket;
import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private int frameSizeX, frameSizeY;
    private SenderPacket senderPacket;

    public MainPanel() {
        super();
        frameSizeX = 600; frameSizeY = 600;
        setPreferredSize(new Dimension(frameSizeX, frameSizeY));
        setVisible(true);
        setLayout(null);
    }

    public void updateSenderPacket(SenderPacket senderPacket) {
        this.senderPacket = senderPacket;

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (senderPacket == null) return;
        drawBall(g);
        //drawPaddles(g);
    }


    private void drawPaddles(Graphics g) {
        g.setColor(Color.BLACK);
    }

    private void drawBall(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(senderPacket.ballX,
                senderPacket.ballY,
                20,
                20);
    }


}
