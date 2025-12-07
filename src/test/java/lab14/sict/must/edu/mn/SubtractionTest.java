package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Subtraction классын тест.
 */
public class SubtractionTest {
    @Test
    void testSubtractPositive() {
        Subtraction calc = new Subtraction();
        assertEquals(1.0, calc.subtract(3.0, 2.0), "3 - 2 нь 1-тэй тэнцүү байх ёстой");
    }

    @Test
    void testSubtractNegative() {
        Subtraction calc = new Subtraction();
        assertEquals(-5.0, calc.subtract(-2.0, 3.0), "-2 - 3 нь -5-тай тэнцүү байх ёстой");
    }
}

