package util;

public class Vector2D {
    private int x, y;

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Vector2D add(Vector2D other) {
        this.x += other.getX();
        this.y += other.getY();
        return this;
    }

    public Vector2D substarct(Vector2D other) {
        this.x -= other.getX();
        this.y -= other.getY();
        return this;
    }
}
