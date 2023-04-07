package lesson3.weekdays;

public class CalendarTest {

    public static void main(String[] args) {
        WeekDays monday = WeekDays.MONDAY;
        WeekDays tuesday = WeekDays.TUESDAY;
        WeekDays wednesday = WeekDays.WEDNESDAY;
        WeekDays thursday = WeekDays.THURSDAY;
        WeekDays friday = WeekDays.FRIDAY;
        WeekDays saturday = WeekDays.SATURDAY;
        WeekDays sunday = WeekDays.SUNDAY;

        System.out.println();

            System.out.println("Monday is a working day " + monday.isWorkingDay());
            System.out.println("Tuesday is a working day " + tuesday.isWorkingDay());
            System.out.println("Sunday is a working day " + sunday.isWorkingDay());

        System.out.println("--------------");

            System.out.println("Saturday is a weekend " + saturday.isWeekEnd());
            System.out.println("Sunday is a weekend  " + sunday.isWeekEnd());
            System.out.println("Monday is a weekend " + monday.isWeekEnd());

    }
}


//        Week week = new Week(WeekDays.SUNDAY);  // создали экземпляр класса Week c параметрами по умолчанию


//        System.out.println(week.isWeekEnd());
//        System.out.println(week.isWorkDay());

//        System.out.println(Arrays.toString(WeekDays.values()));

//        System.out.println(week.isWeekEnd(WeekDays.MONDAY));

//        System.out.println(week.isWorkDay(WeekDays.SUNDAY));


//        System.out.println(Arrays.toString(WeekDays.values())); // выводит все элементы массива (Enum class)

//        System.out.println(WeekDays.MONDAY.ordinal());  // порядковый номер элемента
//
//        System.out.println(WeekDays.values()[0]); // выводит название элемента по индексу массива


//        System.out.println(MONDAY);
//        System.out.println(SUNDAY.ordinal()); // порядковый номер элемента
//        System.out.println(
//                Arrays.toString(
//                        WeekDays.values()
//                )
//            );

//
//        WeekDays day1 = WeekDays.valueOf("WEDNESDAY");
//        System.out.println((WeekDays.valueOf("WEDNESDAY").ordinal()));
//        System.out.println(WeekDays.values()[2]);
//    }
//



