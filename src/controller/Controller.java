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

    public void rightButtonPressedPlayer0() {
        game.rightButtonPressedPlayer0();
    }
    public void leftButtonPressedPlayer0() {
        game.leftButtonPressedPlayer0();
    }
    public void stopPaddlePlayer0() { game.stopPaddlePlayer0(); }

    public void rightButtonPressedPlayer1() {
        game.rightButtonPressedPlayer1();
    }
    public void leftButtonPressedPlayer1() {
        game.leftButtonPressedPlayer1();
    }
    public void stopPaddlePlayer1() { game.stopPaddlePlayer1(); }

}
