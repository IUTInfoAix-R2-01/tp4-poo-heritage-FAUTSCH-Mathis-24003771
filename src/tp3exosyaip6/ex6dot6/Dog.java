package tp3exosyaip6.ex6dot6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Balù");
        Dog dog2 = new Dog("Balù Founders Edition");
        dog1.greets();
        dog2.greets(dog1);
    }
}
