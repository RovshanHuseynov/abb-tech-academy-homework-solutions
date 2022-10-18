import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test1() {
        assertEquals(31, Main.getNumberOfDays(1));
    }

    @Test
    void test2() {
        assertEquals(28, Main.getNumberOfDays(2));
    }

    @Test
    void test3() {
        assertEquals(31, Main.getNumberOfDays(3));
    }

    @Test
    void test4() {
        assertEquals(30, Main.getNumberOfDays(4));
    }

    @Test
    void test5() {
        assertEquals(31, Main.getNumberOfDays(5));
    }

    @Test
    void test6() {
        assertEquals(30, Main.getNumberOfDays(6));
    }

    @Test
    void test7() {
        assertEquals(31, Main.getNumberOfDays(7));
    }

    @Test
    void test8() {
        assertEquals(31, Main.getNumberOfDays(8));
    }

    @Test
    void test9() {
        assertEquals(30, Main.getNumberOfDays(9));
    }

    @Test
    void test10() {
        assertEquals(31, Main.getNumberOfDays(10));
    }

    @Test
    void test11() {
        assertEquals(30, Main.getNumberOfDays(11));
    }

    @Test
    void test12() {
        assertEquals(31, Main.getNumberOfDays(12));
    }
}