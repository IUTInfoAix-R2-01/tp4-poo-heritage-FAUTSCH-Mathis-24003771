package tp3exosyaip4.ex4dot2;

public class Person {
    private final String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }

    public static void main(String[] args) {
        Person person = new Person("John", "123 Main St");
        System.out.println(person);

        person.setAddress("789 Elm St");
        System.out.println(person);
    }
}
