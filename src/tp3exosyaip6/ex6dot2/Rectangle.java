package tp3exosyaip6.ex6dot2;

public class Rectangle implements GeometricObject {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + "]";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.0, 2.0);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
