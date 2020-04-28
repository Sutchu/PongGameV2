package Model.Object;

public class Paddle extends GameObject{

    private int height, width;

    public Paddle(double x, double y) {
        super(x, y);

        height = 5; width = 90;
    }


    public void moveRight() {
        setX(getX() + 5);
        if((getX() + width) > 600)
            setX(600 - width);
    }

    public void moveLeft() {
        setX(getX() + -5);
        if(getX() < 0)
            setX(0);
    }

    public int getHeight() { return height; }
    public int getWidth() { return width; }

}
