package view;

import Controller.Controller;

import java.awt.event.*;
import java.util.ArrayList;

public class Listeners implements MouseMotionListener, MouseListener, KeyListener {

    private byte[] pressedButtons;

    public Listeners() {
        pressedButtons = new byte[2];
    }

    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            pressedButtons[0] = 1;
            updateServer();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            pressedButtons[1] = 1;
            updateServer();
        }
    }

    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            pressedButtons[0] = 0;
            updateServer();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            pressedButtons[1] = 0;
            updateServer();
        }
    }

    public void mousePressed(MouseEvent mouseEvent) {
    }

    public void mouseMoved(MouseEvent mouseEvent) {
        //kendiPaddle'imi hareket ettiricem
    }

    public void mouseClicked(MouseEvent mouseEvent) {}
    public void keyTyped(KeyEvent keyEvent) {}
    public void mouseReleased(MouseEvent mouseEvent) {}
    public void mouseEntered(MouseEvent mouseEvent) {}
    public void mouseExited(MouseEvent mouseEvent) {}
    public void mouseDragged(MouseEvent mouseEvent) {}


    private void updateServer() {
        Controller.getInstance().updateServer(pressedButtons);
    }
}
