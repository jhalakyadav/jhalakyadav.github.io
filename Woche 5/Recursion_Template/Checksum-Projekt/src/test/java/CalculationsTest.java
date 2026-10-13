import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculationsTest {

    @Test
    public void testZero() {
        assertEquals(0, Calculations.checksum(0));
    }

    @Test
    public void testSingleDigit() {
        assertEquals(7, Calculations.checksum(7));
    }

    @Test
    public void testExamplesFromTask() {
        assertEquals(15, Calculations.checksum(258));
        assertEquals(13, Calculations.checksum(49));
        assertEquals(3, Calculations.checksum(12));
    }

    @Test
    public void testZerosInsideNumber() {
        assertEquals(6, Calculations.checksum(10203));
    }

    @Test
    public void testLargeNumber() {
        assertEquals(46, Calculations.checksum(Integer.MAX_VALUE));
    }
}
