package view;

import controller.Controller;
import java.awt.event.*;

public class Listeners implements MouseMotionListener, MouseListener, KeyListener {


    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            Controller.getInstance().leftButtonPressedPlayer0();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            Controller.getInstance().rightButtonPressedPlayer0();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_A) {
            Controller.getInstance().leftButtonPressedPlayer1();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_D) {
            Controller.getInstance().rightButtonPressedPlayer1();
        }

    }
    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            Controller.getInstance().stopPaddlePlayer0();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            Controller.getInstance().stopPaddlePlayer0();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_A) {
            Controller.getInstance().stopPaddlePlayer1();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_D) {
            Controller.getInstance().stopPaddlePlayer1();
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
}
