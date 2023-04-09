package Homeworks.Homework_13_2;

public final class Month {

    private String monthName;
    private int day;
    private int workDay;

    public Month(String monthName, int day, int workDay) {
        this.monthName = monthName;
        this.day = day;
        this.workDay = workDay;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDay() {
        return day;
    }

    public int getWorkDay() {
        return workDay;
    }
}
