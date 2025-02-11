package tp3exosyaip6.ex6dot3;

public class MovablePoint {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint [" + "x=" + x + ", " + "y=" + y + ", " + "xSpeed=" + xSpeed + ", " + "ySpeed=" + ySpeed + "]";
    }
}
