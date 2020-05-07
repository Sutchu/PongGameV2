package Model.Object;

import Model.Vector2D;

public class Ball extends GameObject{

    private int Radius;
    private Vector2D velocity;

    public Ball(double x, double y) {
        super(x, y);

        velocity = new Vector2D();

        //------Silinecek------//
        velocity.setY(-2);
        velocity.setX(4);

        Radius = 10;
    }

    // when this method called, it's velocity will be added to it's position. So it will move.
    public void update() { add(velocity);}

    public Vector2D getVelocity() { return velocity; }
    public int getRadius() { return Radius; }

}
