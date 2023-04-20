package lesson3.date;

public class MyDate {
    private int year;
    private int month;
    private int day;

    // добавить конструкторы, геттеры сеттеры

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // метод выводит true или false если год високосный
    private boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // альтернативный код isLeapYear

//    private boolean isLeapYear(int year)
//    {
//        if(year % 400 == 0)
//            return true;
//        if(year % 100 == 0)
//            return false;
//        return year % 4 == 0;
//    }


    // метод для получения количества дней в месяце
    private int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear() ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    // альтернативный метод для получения количества дней в месяце

//    private int daysInMonth(int month, int year)
//    {
//        switch (month)
//        {
//            case 2:
//            {
//                if(isLeapYear(year))
//                    return 29;
//                else return 28;
//            }
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                return 31;
//            default:
//                return 30;
//        }
//    }

    // добавить дни к дате

    public void addDays(int days) {
        while (days > 0) {

            // количество дней в текущем месяце
            int daysInMonth = getDaysInMonth(month, year);
            if (day + days > daysInMonth) {

                // вычитаем из оставшихся дней количество дней в текущем месяце
                days -= (daysInMonth - day + 1);
                // переходим к следующему месяцу
                month++;
                // если месяц выходит за границы года, переходим к следующему году
                if (month > 12) {
                    year++;
                    month = 1;
                }
                // переходим на первый день следующего месяца
                day = 1;
            } else {

                // оставшихся дней меньше, чем количество дней в текущем месяце
                day += days;
                break;
            }
        }


    }

    // альтернативный код

//    public void add(int days)
//    {
//        int daysLeft = days;
//        int currentDay = day;
//        int currentMonth = month;
//        int currentYear = year;
//        while (daysLeft > 0)
//        {
//            // определим сколько дней осталось до конца текущего месяца
//            int daysLeftInCurrentMonth = daysInMonth(currentMonth, currentYear) - currentDay;
//            // если оставшееся количество дней в месяце больше чем daysLeft
//            if(daysLeftInCurrentMonth >= daysLeft)
//            {
//                currentDay += daysLeft;
//                daysLeft = 0;
//            }
//            else {
//                daysLeft -= (daysLeftInCurrentMonth + 1);
//                currentDay = 1;
//                if(currentMonth == 12)
//                {
//                    currentMonth = 1;
//                    currentYear++;
//                }
//                else {
//                    currentMonth++;
//                }
//            }
//        }
//        year = currentYear;
//        month = currentMonth;
//        day = currentDay;
//    }

}
