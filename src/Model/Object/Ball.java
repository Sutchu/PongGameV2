package Model.Object;

import Model.Vector2D;

public class Ball extends GameObject {

    private int Diameter;
    private Vector2D velocity;

    public Ball(int x, int y) {
        super();

        velocity = new Vector2D();

        setX(x);
        setY(y);

        Diameter = 20;
    }

    public int getDiameter() { return Diameter; }
}
