package lesson4.animals;

public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }


    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog dog) {
        System.out.println("WOOOW");
    }

    public void greets(BigDog bigDog) { // overload
        System.out.println("WOOOOOOOOOW");
    }


}
