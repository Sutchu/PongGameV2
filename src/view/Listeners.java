package view;

import java.awt.event.*;
import java.util.ArrayList;

public class Listeners implements MouseMotionListener, MouseListener, KeyListener {

    private ArrayList<String> pressedButtons;

    public Listeners() {
        pressedButtons = new ArrayList();
    }

    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            pressedButtons.add("left");
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            pressedButtons.add("right");
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

    public ArrayList<String> getPressedkeys() {
        ArrayList<String> tmp = pressedButtons;
        pressedButtons = new ArrayList();
        return tmp;
    }
}
