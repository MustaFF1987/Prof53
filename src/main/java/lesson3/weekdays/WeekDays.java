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


