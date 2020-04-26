package view;



import controller.Controller;

import java.awt.event.*;

public class Listeners implements MouseMotionListener, MouseListener, KeyListener {


    public void keyPressed(KeyEvent keyEvent) {

    }

    public void mousePressed(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
            Controller.getInstance().addBall(mouseEvent.getX(), mouseEvent.getY());
        }
    }

    public void mouseMoved(MouseEvent mouseEvent) {

    }

    public void mouseClicked(MouseEvent mouseEvent) {}
    public void keyReleased(KeyEvent keyEvent) {}
    public void keyTyped(KeyEvent keyEvent) {}
    public void mouseReleased(MouseEvent mouseEvent) {}
    public void mouseEntered(MouseEvent mouseEvent) {}
    public void mouseExited(MouseEvent mouseEvent) {}
    public void mouseDragged(MouseEvent mouseEvent) {}
}
