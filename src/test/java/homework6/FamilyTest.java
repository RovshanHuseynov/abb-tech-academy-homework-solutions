package homework6;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {
    Family family1;
    @BeforeEach
    void init(){
        System.out.println("begin");
        family1 = new Family(new Human(), new Human());
    }

    @Test
    @DisplayName("First Test is being tested")
    public void firstTest(){
        assertTrue(5>0);
    }

    @RepeatedTest(3)
    @DisplayName("Second")
    public void secondTest(){
        assertEquals(20, 5+15,
                "Expected and Actual are not the same");
    }

    @Disabled("I disabled it just to learn this annotation")
    @Test
    @DisplayName("Third")
    public void thirdTest(){
        assertNull(null);
    }
}
