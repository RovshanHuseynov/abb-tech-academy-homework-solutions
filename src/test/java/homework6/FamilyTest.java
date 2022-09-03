package homework6;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {
    Family family1;
    Human human1;
    Human human2;
    Human human3;

    @BeforeEach
    void init(){
        family1 = new Family(new Human(), new Human());

        human1 = new Human("Rovshan", "Huseynov", 1994, 90,
                new String[][] {
                        {DayOfWeek.MONDAY.name(), "go to work"},
                        {DayOfWeek.TUESDAY.name(), "workout"},
                        {DayOfWeek.WEDNESDAY.name(), "go to the party"}
                } );

        human2 = new Human("Samir", "Kerimnov", 1990);

        human3 = new Human("Samir", "Kerimnov", 1990);
    }

    @Test
    @DisplayName("Testing equality of two humans with assertEquals")
    public void test1(){
        assertEquals(human1, human2, "These two humans are not the same");
    }

    @Test
    @DisplayName("Testing equality of two humans with assertEquals")
    public void test2(){
        assertEquals(human2, human3, "No they are not the same");
    }

    @Test
    @DisplayName("Testing equality of human ages")
    public void test3(){
        assertEquals(human2, human3, "No they are not peer");
    }

    @Test
    @DisplayName("Testing equality of two humans with assertTrue")
    public void test4(){
        assertTrue(human1.equals(human2), "No they are not the same");
    }

    @Test
    @DisplayName("Testing equality of two humans with assertTrue")
    public void test5(){
        assertTrue(human2.equals(human3), "No they are not the same");
    }

    @Test
    @DisplayName("Testing equality of hashcode of two humans with assertTrue")
    public void test6(){
        assertEquals(human1.hashCode(), human2.hashCode(), "No they are not the same");
    }

    @Test
    @DisplayName("Testing equality of hashcode of two humans with assertTrue")
    public void test7(){
        assertEquals(human2.hashCode(), human3.hashCode(), "No they are not the same");
    }

    @Disabled
    @DisplayName("First Test is being tested")
    public void firstTest(){
        assertTrue(5>0);
    }

    @Disabled
    @RepeatedTest(3)
    @DisplayName("Second")
    public void secondTest(){
        assertEquals(20, 5+15,
                "Expected and Actual are not the same");
    }

    @Disabled("I disabled it just to learn this annotation")
    @DisplayName("Third")
    public void thirdTest(){
        assertNull(null);
    }
}
