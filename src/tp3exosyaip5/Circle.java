package tp3exosyaip5;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println(c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println(c2);
        System.out.println(c2.getArea());

        Circle c3 = new Circle(3.0, "blue");
        System.out.println(c3);
        System.out.println(c3.getArea());
    }
}
