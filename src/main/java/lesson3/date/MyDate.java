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

}
