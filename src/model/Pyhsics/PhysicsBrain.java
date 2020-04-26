package model.Pyhsics;

import model.Objects.GameObject;

import java.util.ArrayList;

public class PhysicsBrain {
    private CollisionHandler collisionHandler;
    private ArrayList<GameObject> gameObjects;

    public PhysicsBrain(ArrayList<GameObject> gameObjects) {
        collisionHandler = new CollisionHandler(gameObjects);
        this.gameObjects = gameObjects;
    }

    public void applyPhysics() {
        applyVelocity();
        collisionHandler.checkCollisions();
        //applyHavaSurtunmesi();
        //applyYercekimiIvmesi();
        //...
    }

    private void applyVelocity() {
        gameObjects.forEach(object -> object.getPosition().add(object.getVelocity()));
    }
}
