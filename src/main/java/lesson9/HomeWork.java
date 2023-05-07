package lesson9;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*  Есть список стран [Andorra, Belize, France, Argentina, Cuba, Sweden] и
    список слов [Andorra, Canada, wood, parrot, Cuba, Argentina, Aruba, Alex, Finland]
    Нужно получить список всех стран из списка слов, начинающихся на "A" - [Andorra, Argentina] */
public class HomeWork {
    public static void main(String[] args) {

        Set<String> countries = new HashSet<>();
        countries.add("Andorra");
        countries.add("Belize");
        countries.add("France");
        countries.add("Argentina");
        countries.add("Cuba");
        countries.add("Sweden");

        Set<String> words = new HashSet<>();
        words.add("Andorra");
        words.add("Canada");
        words.add("wood");
        words.add("parrot");
        words.add("Cuba");
        words.add("Argentina");
        words.add("Aruba");
        words.add("Alex");
        words.add("Finland");


        Set<String> aList = new HashSet<String>();
        for (String c : countries) {
            if (c.startsWith("A")) {
                aList.add(c);
                for (String e : aList) {
                    if (words.contains(e)){
                        System.out.println(aList);
                        break;
                        }
                    }
                }
            }
        }
    }
