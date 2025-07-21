package datePackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class DateSetDateTest {

    @Test
    public void testSetDate_ValidChange() {
        Date date = new Date(3, 15, 2023); // ✅ Use int constructor
        Date result = date.setDate("October", 20, 2025); // Call the method

        assertNotNull(result); // should not return null
        assertEquals(10, date.getMonth());
        assertEquals(20, date.getDay());
        assertEquals(2025, date.getYear());
    }

    @Test
    public void testSetDate_AnotherValidChange() {
        Date date = new Date(6, 10, 2020);
        Date result = date.setDate("January", 1, 2024);

        assertNotNull(result);
        assertEquals(1, date.getMonth());
        assertEquals(1, date.getDay());
        assertEquals(2024, date.getYear());
    }

    @Test
    public void testSetDate_SameDate() {
        Date date = new Date(5, 5, 2000);
        Date result = date.setDate("May", 5, 2000);

        assertNotNull(result);
        assertEquals(5, date.getMonth());
        assertEquals(5, date.getDay());
        assertEquals(2000, date.getYear());
    }

    @Test
    public void testSetDate_InvalidMonth() {
        Date date = new Date(1, 1, 2023);
        Date result = date.setDate("NotAMonth", 10, 2023); // invalid month

        assertNull(result); // ✅ Expecting null
        assertEquals(1, date.getMonth()); // date should remain unchanged
        assertEquals(1, date.getDay());
        assertEquals(2023, date.getYear());
    }

    @Test
    public void testSetDate_InvalidDay() {
        Date date = new Date(1, 1, 2023);
        Date result = date.setDate("January", 45, 2023); // invalid day

        assertNull(result); // ✅ Expecting null
        assertEquals(1, date.getMonth());
        assertEquals(1, date.getDay());
        assertEquals(2023, date.getYear());
    }

    @Test
    public void testSetDate_InvalidYear() {
        Date date = new Date(1, 1, 2023);
        Date result = date.setDate("January", 15, 999); // invalid year

        assertNull(result); // ✅ Expecting null
        assertEquals(1, date.getMonth());
        assertEquals(1, date.getDay());
        assertEquals(2023, date.getYear());
    }
}

