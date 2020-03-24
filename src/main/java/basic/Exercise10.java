package basic;

public class Exercise10 {

    public String findDay(int d, int m, int y) {
        if (!checkDateValid(d, m, y)) return "Day is invalid";

        final String[] DAYS =  {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }
        int day = (d + 2 * m + 3 * (m + 1) / 5 + y + (y / 4)) % 7;
        return DAYS[day];
    }

    public boolean checkDateValid(int d, int m, int y) {
        if ((d < 1) || (m < 1) || (y < 1)) return false;
        if (m == 2) {
            if (isLeapYear(y)) return d <= 29;
            return d <= 28;
        }
        if ((m - 4) * (m - 6) * (m - 9) * (m - 11) == 0) return d <= 30;
        return d <= 31;
    }

    public boolean isLeapYear(int y) {
        return (y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0));
    }
}
