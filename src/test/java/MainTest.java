import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void month1() {
        assertEquals(31, Main.getNumberOfDays(1));
    }

    @Test
    void month2() {
        assertEquals(28, Main.getNumberOfDays(2));
    }

    @Test
    void month3() {
        assertEquals(31, Main.getNumberOfDays(3));
    }

    @Test
    void month4() {
        assertEquals(30, Main.getNumberOfDays(4));
    }

    @Test
    void month5() {
        assertEquals(31, Main.getNumberOfDays(5));
    }

    @Test
    void month6() {
        assertEquals(30, Main.getNumberOfDays(6));
    }

    @Test
    void month7() {
        assertEquals(31, Main.getNumberOfDays(7));
    }

    @Test
    void month8() {
        assertEquals(31, Main.getNumberOfDays(8));
    }

    @Test
    void month9() {
        assertEquals(30, Main.getNumberOfDays(9));
    }

    @Test
    void month10() {
        assertEquals(31, Main.getNumberOfDays(10));
    }

    @Test
    void month11() {
        assertEquals(30, Main.getNumberOfDays(11));
    }

    @Test
    void month12() {
        assertEquals(31, Main.getNumberOfDays(12));
    }
}