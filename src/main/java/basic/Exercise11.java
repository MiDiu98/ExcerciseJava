package basic;

public class Exercise11 {

    public String findMonth(int m) {
        if ((m < 1) || (m > 12)) return "Month is invalid";

        final String[] MONTHS = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return MONTHS[m - 1];
    }
}
