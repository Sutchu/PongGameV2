package Model.Object;

import Model.Vector2D;

public class Ball extends GameObject {

    private int Radius;
    private Vector2D velocity;

    public Ball(int x, int y) {
        super();

        velocity = new Vector2D();

        setX(x);
        setY(y);

        Radius = 10;
    }


    public int getRadius() { return Radius; }
}
