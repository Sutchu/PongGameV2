package Model.Object;

import Model.Vector2D;

public class GameObject {

    //vector reference
    protected Vector2D position;

    GameObject() {
        position = new Vector2D();
    }

    public int getX() { return (int) position.getX(); }
    public int getY() { return (int) position.getY(); }
    public void setX(int x) { position.setX(x); }
    public void setY(int y) { position.setY(y); }
    public void add(Vector2D vector) { position.add(vector); }

}
