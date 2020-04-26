package view;


import controller.Controller;
import model.Objects.GameObject;

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
        herSeyiCiz(g);
    }


    private void herSeyiCiz(Graphics g) {
        Controller.getInstance()
                .getObjects()
                .forEach(object -> topuCiz(g, object));

        g.setColor(Color.GRAY);
        //Hovering ball
    }

    private void topuCiz(Graphics g, GameObject object) {
        g.fillOval(object.getPosition().getX(),
                object.getPosition().getY(),
                object.getRadius(),
                object.getRadius());
    }
}
