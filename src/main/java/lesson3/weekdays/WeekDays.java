package lesson3.weekdays;

import java.util.Arrays;

public enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWorkDay()
    {
        // возвращать true если день с понедельника по пятницу включительно
        return true;
    }

    public boolean isWeekEnd()
    {
        // возвращать true если день суббота или воскресенье
        return true;
    }


    public static void main(String[] args) {
        System.out.println(MONDAY);
        System.out.println(SUNDAY.ordinal()); // порядковый номер элемента
        System.out.println(
                Arrays.toString(
                        WeekDays.values()
                )
            );

        WeekDays day = WeekDays.FRIDAY;
        WeekDays day1 = WeekDays.valueOf("WEDNESDAY");
        System.out.println((WeekDays.valueOf("WEDNESDAY").ordinal()));
        System.out.println(WeekDays.values()[2]);
    }


}
