package lesson13;

import java.util.*;

public class EmployeeTester {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee(18, "Alex", 35, 5000),
                new Employee(55, "George", 40, 7000),
                new Employee(27, "Bob", 28, 3500),
                new Employee(74, "Collin", 30, 4500),
                new Employee(74, "Evan", 24, 2500),
                new Employee(32, "Zhanna", 42, 6300))
        );


        List<Employee> e = new ArrayList<>();

        List<Comparator<Employee>> c = new ArrayList<>();

        System.out.println();

        compositeSort(e,c);
        System.out.println("Composite comparator: " + employees);
        System.out.println("============================================================================");

        Collections.sort(employees);
        System.out.println("Default comparator by ID: " + employees);

        System.out.println("============================================================================");

        Comparator<Employee> namesComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };


        Collections.sort(employees, namesComparator);
        System.out.println("Comparator by names: " + employees);

        System.out.println("============================================================================");

        Comparator<Employee> ageComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        compositeSort(e,c);
        System.out.println("Composite comparator: " + employees);

        System.out.println("============================================================================");
        Collections.sort(employees, ageComparator);
        System.out.println("Comparator by age: " + employees);

        System.out.println("============================================================================");

        Comparator<Employee> salaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        };

        Collections.sort(employees, salaryComparator);
        System.out.println("Comparator by salary: " + employees);


        System.out.println("============================================================================");
        compositeSort(e,c);
        System.out.println("Composite comparator: " + employees);
    }

    public static void compositeSort (List <Employee> e, List < Comparator < Employee >> c){
        Comparator<Employee> cC = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                for (Comparator<Employee> comparator : c) {
                    int result = comparator.compare(o1, o2);
                    if (result != 0) {
                        return result;
                    }
                }
                return 0;
            }
        };
    }
}
