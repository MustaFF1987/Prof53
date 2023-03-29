package lesson1;

import org.w3c.dom.ls.LSOutput;

public class DogTester {
    //
    public static void main(String[] args) {

        // конструктор по умолчанию
        Dog trezor = new Dog();

//        trezor.age = 5;
//        trezor.name = "Trezor";
//        trezor.breed = "Bulldog";
//        trezor.color = "White";

        trezor.setAge(5);
        trezor.setName("Trezor");
        trezor.setBreed("Bulldog");
        trezor.setColor("White");


        System.out.println("Trezor breed is: " + trezor.getBreed());

        Dog eleonora = new Dog("Bolonka","Eleonora",3, "White");

        eleonora.setAge(29);

        System.out.println("Eleonora age is: " + eleonora.getAge());

      eleonora.bark();
      trezor.bark();

      System.out.println("NUmber of dogs " + Dog.numberOfDogs);

      Dog.hello();

//      int a = 5;
//      int b = 10;
//      a = b;
//
//      final int d = 7;
//      int e = 12;
//      d = e;


    }
}
// Класс в Java - это шаблон для создания объекта - объединение чего-либо по характерным признакам
// Объект - это экземпляр класса - шаблон для описания его представителей (экземляр)
// Класс в Java - набор свойств и действий
// экземпляр - конкретный представитель класса

// модификаторы доступа
// если ничего не указывать, то доступ package private - эти поля видны только в пакете
// public - доступ к полю или методу имеют все классы отовсюду в проекте
// private - доступ имеют только методы этого класса
// protected - доступ имеют только методы класса и его наследников

class Dog {
// конструктор - нужен чтобы правильно инициализировать свойства экземпляра класса

    public Dog(String breed, String name, int age, String color) {
        // this - текущий экземпляр класса
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Dog() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // // меняйте возраст собаки только если от больше 0 и меньше 30
    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 30)
            this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // свойства == переменные класса == поля класса
    private String breed;
    private String name;
    private int age;
    private String color;

    // методы == функции == действия

    void bark() {
        System.out.println(name + " bark-bark ");
    }

    public static int numberOfDogs = 2;

    public static void hello() {
        System.out.println("Hello");
    }
}