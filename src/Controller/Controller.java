package Controller;

import Model.Game;
import Model.Object.GameObject;
import Model.Vector2D;

import java.util.ArrayList;

public class Controller {
    private static Controller instance;
    private Game game;

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        } return instance;
    }

    private Controller() {
        game = new Game();
    }

    public ArrayList<GameObject> getGameObjects() {
        return game.getGameObjects();
    }

    public void updateVelocities(Vector2D ball, Vector2D paddleDown, Vector2D paddleUp) {
        game.updatePositions(ball, paddleDown, paddleUp);
    }

    public void updatePositions(Vector2D ball, Vector2D paddleDown, Vector2D paddleUp) {
        game.updateVelocities(ball, paddleDown, paddleUp);
    }

    public void updateGame() {
        game.updateGame();
    }
}
