package tp3exosyaip6.ex6dot6;

public abstract class Animal {
    @SuppressWarnings("FieldCanBeLocal")
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
