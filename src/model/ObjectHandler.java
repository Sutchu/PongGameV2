package model;

import model.Objects.Ball;
import model.Objects.GameObject;
import model.Pyhsics.PhysicsBrain;

import java.util.ArrayList;

public class ObjectHandler {
    private ArrayList<GameObject> gameObjects;
    private PhysicsBrain physicsBrain;

    public ObjectHandler() {
        gameObjects = new ArrayList();
        physicsBrain = new PhysicsBrain(gameObjects);
    }

    public void addBall(int x, int y, int radius) {
        gameObjects.add(new Ball(x, y, radius));
    }

    public void addBall(int x, int y) {
        addBall(x, y, 20);
    }

    public ArrayList<GameObject> getObjects() {
        return gameObjects;
    }

    public void updateAll() {
        gameObjects.forEach(n -> n.update());
        physicsBrain.applyPhysics();
    }
}
