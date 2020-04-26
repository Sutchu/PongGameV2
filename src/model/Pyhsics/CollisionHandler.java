package model.Pyhsics;

import model.Objects.GameObject;

import java.util.ArrayList;

public class CollisionHandler {

    private ArrayList<GameObject> gameObjects;

    public CollisionHandler(ArrayList<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }

    public void checkCollisions() {
        checkWallCollisions();
        //checkBallBallcollisions();
        //checkBilmemneCollisions();
        //..
    }

    private void checkWallCollisions() {
        for (GameObject object: gameObjects) {
            if (object.getPosition().getX() <= 0 || object.getPosition().getX() + object.getRadius() >= 600) {
                object.getVelocity().setX(object.getVelocity().getX() * -1);
            }

            if (object.getPosition().getY() <= 0 || object.getPosition().getY() + object.getRadius() >= 600) {
                object.getVelocity().setY(object.getVelocity().getY() * -1);
            }
        }
    }
}
