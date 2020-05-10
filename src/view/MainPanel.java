package view;

import Controller.Controller;
import Model.Object.GameObject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainPanel extends JPanel {

    private int frameSizeX, frameSizeY;

    /**Prepares panel*/
    public MainPanel() {
        super();
        frameSizeX = 600; frameSizeY = 600;
        setPreferredSize(new Dimension(frameSizeX, frameSizeY));
        setLayout(null);
        setVisible(true);
    }

    /**
     * Draws every object.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Update game before drawing the next frame
        Controller.getInstance().updateGame();

        ArrayList<GameObject> objects = Controller.getInstance().getGameObjects();
        drawBall(g, objects.get(0));
        drawPaddle(g, objects.get(1));
        drawPaddle(g, objects.get(2));
    }


    private void drawPaddle(Graphics g, GameObject object) {
        g.setColor(Color.BLACK);
        g.fillRect(object.getX(), object.getY(), 90, 5);
    }

    private void drawBall(Graphics g, GameObject object) {
        g.setColor(Color.BLUE);
        g.fillOval(object.getX(),
                object.getY(),
                20,
                20);
    }
}
