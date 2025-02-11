package tp3exosyaip5;

public class Cylinder {
    private double height = 1.0;
    private Circle circle = new Circle();

    public Cylinder() {
    }

    public Cylinder(double radius) {
        this.circle = new Circle(radius);
    }

    public Cylinder(double radius, double height) {
        this.circle = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        this.circle = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return circle.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + ", circle=" + circle + "]";
    }

    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        Cylinder cy2 = new Cylinder(2.0);
        Cylinder cy3 = new Cylinder(3.0, 4.0);
        Cylinder cy4 = new Cylinder(5.0, 6.0, "green");

        System.out.println(cy1);
        System.out.println(cy1.getVolume());

        System.out.println(cy2);
        System.out.println(cy2.getVolume());

        System.out.println(cy3);
        System.out.println(cy3.getVolume());

        System.out.println(cy4);
        System.out.println(cy4.getVolume());
    }
}
