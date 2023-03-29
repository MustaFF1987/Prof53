package lesson1.japanese;

import org.w3c.dom.ls.LSOutput;

public class JapaneseEmployee {

    // Mitsuo Baso     120_000    4
    // Akura Kurosava   100_000   12

    public static void main(String[] args) {
        JapaneseEmployee misuo = new JapaneseEmployee("Mitsuo", "Baso",
                120_000, 4);

        JapaneseEmployee akira = new JapaneseEmployee("Akira", "Kurosava",
                100_000, 12);

        System.out.println(misuo.getFirstName() + " " + misuo.calculateSalary());
        System.out.println(akira.getFirstName() + " " + akira.calculateSalary());

        akira.hello();
        misuo.hello();

    }


    // если работник работает больше 10 лет преветствовать его
    // Добрый день имя фамилия
    // если меньше то
    // Привет имя

    public void hello() {
        if (years >= 10)
            System.out.println("Hello Mrs " + firstName);
        else
            System.out.println("Hello " + firstName);
    }


    private String firstName;
    private String lastName;
    private double baseSalary;
    private int years;

    public static int delta = 10_000;


    public int calculateSalary() {
        return (int) baseSalary + delta * years;
    }


    public JapaneseEmployee(String firstName, String lastName, double baseSalary, int years) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.years = years;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

}




