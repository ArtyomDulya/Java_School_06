package Homeworks.Homework_13_2;

public class MonthUtils {

    private static final Month januar = new Month("Januar", 31, 23);
    private static final Month february = new Month("February", 29, 23);
    private static final Month march = new Month("March", 31, 23);
    private static final Month april = new Month("April", 30, 23);
    private static final Month may = new Month("May", 31, 23);
    private static final Month june = new Month("June", 30, 23);
    private static final Month jule = new Month("Jule", 31, 23);
    private static final Month august = new Month("August", 31, 23);
    private static final Month september = new Month("September", 30, 23);
    private static final Month oktober = new Month("Oktober", 31, 23);
    private static final Month november = new Month("November", 30, 23);
    private static final Month december = new Month("December", 31, 23);


    public static Month[][] months = {{januar, february, march}, {april, may, june}, {jule, august, september},
            {oktober, november, december}};

    public static Month[] getQuarter(int numberQuarter) {

        Month[] arrQuarter = new Month[3];

        if (numberQuarter == 1) {
            arrQuarter = months[0];
        }
        if (numberQuarter == 1) {
            arrQuarter = months[1];
        }
        if (numberQuarter == 1) {
            arrQuarter = months[2];
        }
        if (numberQuarter == 1) {
            arrQuarter = months[3];
        }

        return arrQuarter;
    }

    static final class Month {
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
}
