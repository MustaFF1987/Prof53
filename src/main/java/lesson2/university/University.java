package lesson2.university;

public class University {
    public static void main(String[] args) {

        Student max = new Student("Max", 20, 2, "music");
        Staff alex = new Staff("Alex", 43, 50_000, "math");
        Student margaret = new Student("Margaret", 21, 3, "politics");

        // массив из студентов и работников

        Person[] people = new Person[10];
        people[0] = max;
        people[1] = alex;
        people[2] = margaret;

        // с помощью цикла посчитатйте суммарный возраст людей в цнивере

        int sum = 0;
        for(int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                sum += people[i].getAge();
                people[i].introduce();
            }
        }
            System.out.println("summary age: " + sum);
    }
}
