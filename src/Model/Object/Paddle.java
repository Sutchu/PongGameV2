package Model.Object;

import Model.Vector2D;

public class Paddle extends GameObject{

    private int height, width;
    private Vector2D velocity;

    public Paddle(double x, double y) {
        super(x, y);

        velocity = new Vector2D();

        height = 5; width = 90;
    }

    public void update(){
        if(0 <= (getX() + velocity.getX()) && (getX() + width + velocity.getX()) <= 600)
            add(velocity);

    }

    public void moveRight() { velocity.setX(5); }
    public void moveLeft() { velocity.setX(-5); }
    public void stopPaddle() { velocity.setX(0); }

    public int getHeight() { return height; }
    public int getWidth() { return width; }

}
