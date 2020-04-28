package Model;

public class Vector2D {

    // dimensions of vector
    private double x, y;

    public Vector2D(){
        x = 0;
        y = 0;
    }

    /*
     * The method takes an angle and rotate vector.
     */
    public void rotate(double angle){
        angle = Math.PI*angle/180;
        double firstX = x;
        double firstY = y;

        x = firstX*Math.cos(angle);
        x += -firstY*Math.sin(angle);

        y = firstY*Math.cos(angle);
        y += firstX*Math.sin(angle);
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
