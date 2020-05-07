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

    public void updateGame(double dt) {
        game.updateGame(dt);
    }

    public void rightButtonPressed() {
        game.rightButtonPressedPlayer0();
    }

    public void leftButtonPressed() {
        game.leftButtonPressedPlayer0();
    }
}
