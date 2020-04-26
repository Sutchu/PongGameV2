package model.Objects;

import util.Vector2D;

public abstract class GameObject {
    protected Vector2D position, velocity;
    protected int radius;


    public GameObject(int x, int y, int radius) {
        position = new Vector2D(x, y);
        velocity = new Vector2D(0, 2);
        this.radius = radius;
    }

    public Vector2D getPosition() {
        return position;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public int getRadius() {
        return radius;
    }

    public abstract void update();
}
