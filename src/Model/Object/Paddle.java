package Model.Object;

public class Paddle extends GameObject{

    private int height, width;

    public Paddle() {
        super();

        height = 5; width = 90;
    }

    public int getHeight() { return height; }
    public int getWidth() { return width; }

}
