package lesson13;

import java.util.Comparator;

public class Employee2 implements Comparable<Employee2> {

    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee2(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "E{" +
                "i=" + id +
                ", n='" + name + '\'' +
                ", a=" + age +
                ", s=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee2 o) {
        return Integer.compare(id, o.getId());
    }

    public static Comparator<Employee2> ageComparator = new Comparator<Employee2>() {
        @Override
        public int compare(Employee2 o1, Employee2 o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

        public static Comparator<Employee2> salaryComparator = Comparator.comparingDouble(Employee2::getSalary);

        public static Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
    };
}






