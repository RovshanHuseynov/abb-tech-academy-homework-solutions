package homework6;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FamilyTest {
    Family family1;
    @BeforeEach
    void init(){
        System.out.println("begin");
        family1 = new Family(new Human(), new Human());
    }

    @Test
    public void firstTest(){
        Assert.assertTrue(true);
    }

    @Test
    public void secondTest(){
        Assert.assertTrue("hello", true);
    }
}
