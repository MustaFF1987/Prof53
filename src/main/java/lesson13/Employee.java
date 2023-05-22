package lesson13;
/*1 уровень сложности: 1.1 Создайте класс Employee
int id, String name, int age, double salary
1.2 Сделайте его сортируемым по-умолчанию по идентификатору
1.3 Добавьте в виде статических полей компараторы для сортировки по возрасту, имени и по зарплате
*1.4 Напишите функцию которая принимает на вход коллекцию Employee и коллекцию Comparator и сортирует коллекцию сотрудников композитным компаратором
public static void compositeSort(List e, List> c) { … }*/

import java.util.Collections;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
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
        return "Employee{" +
                "id= " + id +
                ", name=' " + name + '\'' +
                ", age= " + age +
                ", salary= " + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(getId(), o.getId());
    }


}





