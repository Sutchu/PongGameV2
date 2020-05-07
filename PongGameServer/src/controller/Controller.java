package controller;


import Model.Game;
import Model.Object.Ball;
import Model.Object.Paddle;
import java.util.ArrayList;

public class Controller {
    private static Controller instance;

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    private Game game;

    private Controller(){
        game = new Game();
    }

    public Ball getBall() {
        return game.getBall();
    }

    public ArrayList<Paddle> getPaddles() {
        return game.getPaddles();
    }

    public void updateGame() {
        game.updateGame();
    }

    synchronized public void pressedButtons(ArrayList<String> pressedButtons) {
        if (pressedButtons.size() == 0) {
            return;
        }
        if (pressedButtons.get(pressedButtons.size()-1).equals("left")) {
            game.leftButtonPressed();
        } else if (pressedButtons.get(pressedButtons.size()-1).equals("right")) {
            game.rightButtonPressed();
        }
    }

    public void rightButtonPressed() {
        game.rightButtonPressed();
    }

    public void leftButtonPressed() {
        game.leftButtonPressed();
    }
}
