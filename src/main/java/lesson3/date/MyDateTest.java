package lesson3.date;

public class MyDateTest {

    public static void main(String[] args) {

        MyDate myDate = new MyDate(0,0,0);

        myDate.setYear(2020);
        myDate.setMonth(10);
        myDate.setDay(15);

        myDate.addDays(15);

        System.out.println();
        System.out.println("Day: " + myDate.getDay() + ", Month: " + myDate.getMonth() + ", Year: " +  myDate.getYear());



    }

}
