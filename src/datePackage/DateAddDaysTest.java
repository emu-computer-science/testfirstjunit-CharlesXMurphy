package datePackage;

import static org.junit.Assert.*;
import org.junit.Test;


public class DateAddDaysTest {
	
    @Test
    public void testAddOneDaySameMonth() {
        Date date = new Date("January", 20, 2024);
        Date expected = new Date("January", 21, 2024);
        assertEquals(expected, date.addOneDay());
    }

    @Test
    public void testAddOneDayNextMonth() {
        Date date = new Date("January", 31, 2024);
        Date expected = new Date("February", 1, 2024);
        assertEquals(expected, date.addOneDay());
    }

    @Test
    public void testAddOneDayNextYear() {
        Date date = new Date("December", 31, 2024);
        Date expected = new Date("January", 1, 2025);
        assertEquals(expected, date.addOneDay());
    }

}
