package datePackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class DateAddDaysTest {

    @Test
    public void testAddOneDaySameMonth() {
        Date date = new Date(1, 20, 2024);  // January 20, 2024
        Date expected = new Date(1, 21, 2024); // January 21, 2024
        assertEquals(expected, date.addOneDay());
    }

    @Test
    public void testAddOneDayNextMonth() {
        Date date = new Date(1, 31, 2024); // January 31, 2024
        Date expected = new Date(2, 1, 2024); // February 1, 2024
        assertEquals(expected, date.addOneDay());
    }

    @Test
    public void testAddOneDayNextYear() {
        Date date = new Date(12, 31, 2024); // December 31, 2024
        Date expected = new Date(1, 1, 2025); // January 1, 2025
        assertEquals(expected, date.addOneDay());
    }

    @Test
    public void testAddOneDayLeapYear() {
        Date date = new Date(2, 28, 2024); // Leap year
        Date expected = new Date(2, 29, 2024); // Feb 29, 2024
        assertEquals(expected, date.addOneDay());
    }

    @Test
    public void testAddOneDayEndOfFebNonLeapYear() {
        Date date = new Date(2, 28, 2023); // Not a leap year
        Date expected = new Date(3, 1, 2023); // March 1, 2023
        assertEquals(expected, date.addOneDay());
    }
}

