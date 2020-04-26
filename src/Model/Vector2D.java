package Model;

public class Vector2D {

    // dimensions of vector
    private double x, y;

    public Vector2D(){
        x = 0;
        y = 0;
    }



    //  setter methods
    public void setX(double x){ this.x = x; }
    public void setY(double y){ this.y = y; }
    //  getter methods
    public double getX() { return x; }
    public double getY() { return y; }
    //  vector adder
    public void add(Vector2D vector) {
        x += vector.getX();
        y += vector.getY();
    }
}
