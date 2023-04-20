package lesson3.date;

public class MyDateTest {

    public static void main(String[] args) {

        MyDate myDate = new MyDate(2022,4,18);

//        myDate.setYear(2020);
//        myDate.setMonth(10);
//        myDate.setDay(15);

        myDate.addDays(365);
        System.out.println(myDate);

//        System.out.println();
//        System.out.println("Day: " + myDate.getDay() + ", Month: " + myDate.getMonth() + ", Year: " +  myDate.getYear());


    }

}
