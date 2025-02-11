package tp3exosyaip6;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }

    public static void main(String[] args) {
        BigDog bigDog1 = new BigDog("Balùsotaure");
        BigDog bigDog2 = new BigDog("Balùsotaure El Pablo");
        Dog dog1 = new Dog("Balù");
        bigDog1.greets();
        bigDog2.greets(dog1);
        bigDog2.greets(bigDog1);
    }
}
