package view;

import java.awt.event.*;

public class Listeners implements MouseMotionListener, MouseListener, KeyListener {


    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            //Controller.getInstance().leftButtonPressed();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            //Controller.getInstance().rightButtonPressed();
        }
    }

    public void mousePressed(MouseEvent mouseEvent) {
    }

    public void mouseMoved(MouseEvent mouseEvent) {
        //kendiPaddle'imi hareket ettiricem
    }

    public void mouseClicked(MouseEvent mouseEvent) {}
    public void keyReleased(KeyEvent keyEvent) {}
    public void keyTyped(KeyEvent keyEvent) {}
    public void mouseReleased(MouseEvent mouseEvent) {}
    public void mouseEntered(MouseEvent mouseEvent) {}
    public void mouseExited(MouseEvent mouseEvent) {}
    public void mouseDragged(MouseEvent mouseEvent) {}
}
