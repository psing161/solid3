import org.example.Smell1AlmostBest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Smell1AlmostBestTest {

    @Test
    void testToPower() {
        assertEquals(8, Smell1AlmostBest.toPower(2, 3), "Power should return correct power value");
    }

    @Test
    void testToPowerZero() {
        assertEquals(1, Smell1AlmostBest.toPower(2, 0), "Power should return 1 when power value is 0");
    }

    @Test
    void testToPowerNegativeNumEvenPow() {
        assertEquals(4, Smell1AlmostBest.toPower(-2, 2), "Power should return 1 when power value is 0");
    }

    @Test
    void testToPowerNegativeNumOddPow() {
        assertEquals(-8, Smell1AlmostBest.toPower(-2, 3), "Power should return 1 when power value is 0");
    }

    @Test
    void testToPowerNegativePow() {
        assertEquals(1, Smell1AlmostBest.toPower(2, -2), "All negative powers are returning 1");
    }

    @Test
    void testToPowerNegativePowZero() {
        assertEquals(1, Smell1AlmostBest.toPower(0, -2), "All negative powers are returning 0");
    }

    @Test
    void testToPowerMaxBase() {
        assertEquals(1, Smell1AlmostBest.toPower(Integer.MAX_VALUE, 2), "All powers are returning 1 for all the Maximum values.");
    }

    @Test
    void testToPowerMaxPower() {
        assertEquals(0, Smell1AlmostBest.toPower(2, Integer.MAX_VALUE), "All powers are returning 0 for all the Maximum values.");
    }

    @Test
    void testToPowerMinBase() {
        assertEquals(0, Smell1AlmostBest.toPower(Integer.MIN_VALUE, 2), "All powers are returning 0 for all the Minimum values.");
    }

    @Test
    void testToPowerMinPower() {
        assertEquals(1, Smell1AlmostBest.toPower(2, Integer.MIN_VALUE), "All powers are returning 1 for all the Minimum values.");
    }


    @Test
    void testToPowerCaching() {
        assertEquals(8, Smell1AlmostBest.toPower(2, 3), "Power should return correct power value");
        assertEquals(8, Smell1AlmostBest.toPower(2, 3), "Power should return same power to see caching value");
    }


}
