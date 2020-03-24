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
        if (((y % 400 == 0) || (y % 4 == 0)) && (y % 100 != 0) && (m == 2)) {
            if (d > 29) return false;
            return true;
        }
        if ((m == 2) && (d > 28)) return  false;
        if (((m == 4) || (m == 6) || (m == 9) || (m == 11)) && (d > 30)) return false;
        if (d > 31) return  false;
        return  true;
    }
}
