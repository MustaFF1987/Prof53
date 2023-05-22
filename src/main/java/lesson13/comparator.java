package lesson13;

import java.util.*;

public class comparator {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a == b);

        String n1 = "value";
        String n2 = "value";
        System.out.println(n1 == n2); // false
        System.out.println(n1 == n1); // true

        Cat c1 = new Cat("Barsik", 4);
        Cat c2 = new Cat("Barsik", 4);

        System.out.println(c1.equals(c2)); // true

        List<String> groups = new ArrayList<>(
                Arrays.asList("Aerosmith", "Guns and Roses", "Led Zeppelin", "Pearl Jam", "Beatles", "Cranberries")
        );
        System.out.println(groups);
        Collections.sort(groups);
        System.out.println(groups);
        Collections.sort(groups, Collections.reverseOrder());
        System.out.println(groups);

        Mover penguin = new Mover(){
            @Override
            public void fly() {
                super.fly();
                System.out.println("Flying");
            }

            @Override
            public void swim() {
                super.swim();
                System.out.println("Swimming");
            }
        };



    }
}

    class Cat{
        String name;
        int age;

        public Cat (String name, int age) {
            this.name = name;
            this.age = age;
    }

//        @Override
//        public boolean equals(Object obj) {
//            if(obj == null)
//                return false;
//            if(this == obj)
//                return true;
//            if(!(obj instanceof Cat))
//                return false;
//            Cat c = (Cat) obj;
//            return age == c.age && name.equals(c.name);
//        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cat cat)) return false;
            return age == cat.age && Objects.equals(name, cat.name);
        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(name, age);
//        }
    }
