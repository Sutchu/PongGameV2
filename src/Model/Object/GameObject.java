package Model.Object;

import Model.Vector2D;

public class GameObject {

    //vector reference
    protected Vector2D position;

    GameObject(double x, double y) {
        position = new Vector2D();

        setX(x);
        setY(y);
    }

    public int getX() { return (int) position.getX(); }
    public int getY() { return (int) position.getY(); }
    public void setX(double x) { position.setX(x); }
    public void setY(double y) { position.setY(y); }
    public void add(Vector2D vector) { position.add(vector); }

}
