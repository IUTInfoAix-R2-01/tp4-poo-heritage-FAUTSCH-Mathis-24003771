package tp3exosyaip6.ex6dot5;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle c = new ResizableCircle(5);
        System.out.println(c);
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());
        c.resize(50);
        System.out.println(c);
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());
    }
}
