package Model.Object;

import Model.Vector2D;

public class Ball extends GameObject {

    private int Radius;
    private Vector2D velocity;

    public Ball(double x, double y) {
        super(x, y);

        velocity = new Vector2D();


        Radius = 10;
    }


    public int getRadius() { return Radius; }

}
