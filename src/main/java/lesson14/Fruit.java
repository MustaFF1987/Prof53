package lesson14;

import java.util.Comparator;

public class Fruit {
    private String name;
    private int calories;

    public Fruit(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }

    //    class CaloriesComparator implements Comparator<Fruit> {
//        @Override
//        public int compare(Fruit f1, Fruit f2) {
//            return Integer.compare(f1.getCalories(), f2.getCalories());
//        }
    }


