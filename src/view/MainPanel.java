package view;


import Model.Object.Ball;
import controller.Controller;
import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private int frameSizeX, frameSizeY;

    public MainPanel() {
        super();
        frameSizeX = 600; frameSizeY = 600;
        setPreferredSize(new Dimension(frameSizeX, frameSizeY));
        setVisible(true);
        setLayout(null);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBall(g);
        drawPaddles(g);
    }


    private void drawPaddles(Graphics g) {
        g.setColor(Color.BLACK);
        Controller.getInstance()
                .getPaddles()
                .forEach(paddle -> g.fillRect(paddle.getX(), paddle.getY(), paddle.getWidth(), paddle.getHeight()));
    }

    private void drawBall(Graphics g) {
        g.setColor(Color.BLUE);
        Ball ball = Controller.getInstance().getBall();
        g.fillOval(ball.getX(),
                ball.getY(),
                ball.getRadius()*2,
                ball.getRadius()*2);
    }


}
