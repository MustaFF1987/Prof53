package lesson4.animals;

public class AnimalsTester {

    public static void main(String[] args) {

        Cat cat = new Cat("Kitty");

        cat.greets();

        Dog dog = new Dog("George");
        BigDog bigDog = new BigDog("Big Dog");


        dog.greets(dog);
        dog.greets(bigDog);

        bigDog.greets(dog);
        bigDog.greets(bigDog);
    }


}
