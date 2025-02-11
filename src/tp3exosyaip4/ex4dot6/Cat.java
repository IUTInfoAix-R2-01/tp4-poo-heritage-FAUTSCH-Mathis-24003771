package tp3exosyaip4.ex4dot6;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat [" + super.toString() + "]";
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Felix");
        cat.meow();
    }
}
