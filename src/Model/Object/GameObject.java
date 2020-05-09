package Model.Object;

import Model.Vector2D;

public class GameObject {

    //vector reference
    protected Vector2D position, velocity;

    GameObject() {
        position = new Vector2D();
        velocity = new Vector2D();
    }

    public int getX() { return (int) position.getX(); }
    public int getY() { return (int) position.getY(); }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }
    public void setPosition(Vector2D position) {
        this.position = position;
    }

    // when this method called, it's velocity will be added to it's position. So it will move.
    public void update() {
        position.add(velocity);
    }

}
