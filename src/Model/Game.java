package Model;

import Model.Object.Ball;
import Model.Object.GameObject;
import Model.Object.Paddle;

import java.util.ArrayList;

public class Game {

    private ArrayList<GameObject> gameObjects; // [ball, paddleDown, paddleUp]

    public Game() {
        gameObjects = new ArrayList();
        gameObjects.add(new Ball());    // ball
        gameObjects.add(new Paddle());  // paddleDown
        gameObjects.add(new Paddle());  // paddleUp
    }

    public void updateGame() {
        gameObjects.forEach(gameObject -> gameObject.update());
    }

    public void updateVelocities(Vector2D ball, Vector2D paddleDown, Vector2D paddleUp) {
        gameObjects.get(0).setVelocity(ball);
        gameObjects.get(1).setVelocity(paddleDown);
        gameObjects.get(2).setVelocity(paddleUp);
    }
    public void updatePositions(Vector2D ball, Vector2D paddleDown, Vector2D paddleUp) {
        gameObjects.get(0).setPosition(ball);
        gameObjects.get(1).setPosition(paddleDown);
        gameObjects.get(2).setPosition(paddleUp);
    }

    public ArrayList<GameObject> getGameObjects() { return gameObjects; }

}
