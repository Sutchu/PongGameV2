package Model.Object;

public class Paddle extends GameObject{

    private int height, width;

    public Paddle(int x, int y) {
        super();

        setX(x);
        setY(y);

        height = 5; width = 30;
    }



    public int getHeight() { return height; }
    public int getWidth() { return width; }

}
