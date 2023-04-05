package lesson3.weekdays;

import java.time.MonthDay;

public class Week {
    private WeekDays days;

    public Week(WeekDays days) {
        this.days = days;
    }

    // возвращать true если день с понедельника по пятницу включительно
    public boolean Days(WeekDays days) {

        boolean day = true;

        if (days.equals(WeekDays.MONDAY)) {
            System.out.println("It's a Monday = Working day");
            return day;
        } else if (days.equals(WeekDays.TUESDAY)) {
            System.out.println("It's a Tuesday  = Working day");
            return day;
        } else if (days.equals(WeekDays.WEDNESDAY)) {
            System.out.println("It's a Wednesday  = Working day");
            return day;
        } else if (days.equals(WeekDays.THURSDAY)) {
            System.out.println("It's a Thursday  = Working day");
            return day;
        } else if (days.equals(WeekDays.FRIDAY)) {
            System.out.println("It's a Friday  = Working day");
            return day;
        } else if (days.equals(WeekDays.SATURDAY)) {
            System.out.println("It's a Saturday = Weekend");
            return day;
        } else if (days.equals(WeekDays.SUNDAY)) {
            System.out.println("It's a Sunday = Weekend");
        }
            return day;
    }
}






