package lesson30;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Supplier;

public class CalendarTester {
    public static void main(String[] args) throws ParseException {
        Calendar calendar  = Calendar.getInstance(); // текущая дата + время

        calendar.set(Calendar.DAY_OF_MONTH, 3);
        calendar.add(Calendar.MONTH, 4);

        System.out.println(calendar.getTime());

        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(
                myFormat.format(calendar.getTime())
        );

        Date d = myFormat.parse("1984-03-24 05:00:23");
        System.out.println(d);

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // какой день недели у даты
        System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)); // какой день недели у даты

    }
}
