package tp3exosyaip6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Perla");
        cat.greets();
    }
}
