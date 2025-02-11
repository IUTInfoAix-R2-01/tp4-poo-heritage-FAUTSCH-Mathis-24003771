package tp3exosyaip4.ex4dot6;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog [" + super.toString() + "]";
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Watson");
        Dog dog2 = new Dog("Nougat");
        dog1.greets();
        dog1.greets(dog2);
    }
}
