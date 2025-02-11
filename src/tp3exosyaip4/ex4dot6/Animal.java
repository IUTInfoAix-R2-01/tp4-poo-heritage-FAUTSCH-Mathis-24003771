package tp3exosyaip4.ex4dot6;

public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + "]";
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Rex");
        System.out.println(animal);
    }
}
