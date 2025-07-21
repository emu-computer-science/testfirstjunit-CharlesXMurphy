package datePackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class DateSetDateTest {

    @Test
    public void testSetDate_ValidChange() {

        Date date = new Date(3, 15, 2023); 

        date.setDate("October", 20, 2025);

        assertEquals(10, date.getMonth()); 
        assertEquals(20, date.getDay());
        assertEquals(2025, date.getYear());
    }
    @Test
    public void testSetDate_AnotherValidChange() {
        Date date = new Date(6, 10, 2020);
        date.setDate("January", 1, 2024);

        assertEquals(1, date.getMonth());
        assertEquals(1, date.getDay());
        assertEquals(2024, date.getYear());
    }
    @Test
    public void testSetDate_SameDate() {
        Date date = new Date(5, 5, 2000);
        date.setDate("May", 5, 2000);

        assertEquals(5, date.getMonth());
        assertEquals(5, date.getDay());
        assertEquals(2000, date.getYear());
    }
}
