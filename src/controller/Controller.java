package controller;

import model.ObjectHandler;
import model.Objects.GameObject;

import java.util.ArrayList;

public class Controller {
    private static Controller instance;
    private ObjectHandler objectHandler;

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    private Controller(){
        objectHandler = new ObjectHandler();
    }

    public void addBall(int x, int y) {
        objectHandler.addBall(x, y);
    }

    public ArrayList<GameObject> getObjects() {
        return objectHandler.getObjects();
    }

    public void updateAll() {
        objectHandler.updateAll();
    }
}
