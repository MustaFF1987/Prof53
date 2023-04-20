package lesson3.weekdays;

public enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWorkingDay(){
        int ordinal = this.ordinal();
        return ordinal < 5;
    }

    public boolean isWeekEnd() {
        int ordinal = this.ordinal();
        return ordinal > 4;
    }

}

// альтернативный способ написания кода:

//    public boolean isWorkDay()
//    {
//        // возвращать true если день с понедельника по пятницу включительно
//        return !isWeekEnd();
//    }
//
//    public boolean isWeekEnd()
//    {
//        // возвращать true если день суббота или воскресенье
//        return ordinal() == 5 || ordinal() == 6;
//    }



