package basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise10Test {

    @Test
    public void test_findDay() {
        assertEquals(new Exercise10().findDay(24, 3, 2020), "Tuesday");
        assertEquals(new Exercise10().findDay(31, 7, 2020), "Friday");
        assertEquals(new Exercise10().findDay(29, 2, 2020), "Saturday");
        assertEquals(new Exercise10().findDay(31, 9, 2020), "Day is invalid");
        assertEquals(new Exercise10().findDay(31, 8, 2020), "Monday");
        assertEquals(new Exercise10().findDay(30, 2, 2020), "Day is invalid");
    }

    @Test
    public void test_checkDayValid() {
        assertEquals(new Exercise10().checkDateValid(1, 9, 2020), true);
        assertEquals(new Exercise10().checkDateValid(31, 3, 2020), true);
        assertEquals(new Exercise10().checkDateValid(24, 3, 2020), true);
        assertEquals(new Exercise10().checkDateValid(31, 7, 2020), true);
        assertEquals(new Exercise10().checkDateValid(30, 7, 2020), true);
        assertEquals(new Exercise10().checkDateValid(32, 7, 2020), false);

        assertEquals(new Exercise10().checkDateValid(30, 2, 2020), false);
        assertEquals(new Exercise10().checkDateValid(29, 2, 2019), false);
        assertEquals(new Exercise10().checkDateValid(2, 2, 2020), true);
        assertEquals(new Exercise10().checkDateValid(28, 2, 2019), true);
    }

    @Test
    public void test_isLeapYear() {
        assertEquals(new Exercise10().isLeapYear(2000), true);
        assertEquals(new Exercise10().isLeapYear(2100), false);
        assertEquals(new Exercise10().isLeapYear(2020), true);
    }
}
