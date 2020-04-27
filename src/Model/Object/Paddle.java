package Model.Object;

public class Paddle extends GameObject{

    private int height, width;

    public Paddle(double x, double y) {
        super(x, y);

        height = 5; width = 30;
    }



    public int getHeight() { return height; }
    public int getWidth() { return width; }

}
