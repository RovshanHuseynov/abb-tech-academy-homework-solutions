package homework7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Pet pet1;
    Pet pet2;

    @BeforeEach
    void setUp() {
        pet1 = new Dog(false);
        pet2 = new Dog("Rick", 1, 40,
                new String[]{"jump", "lick", "smell", "play", "bark"});
    }

    @Test
    @DisplayName("Testing UNKNOWN species of pet")
    public void test1(){
        assertEquals(pet1.getSpecies(), Species.UNKNOWN, "No they are not the same");
    }

    @Test
    @DisplayName("Testing tricklevel of Dog")
    public void test2(){
        assertTrue(pet2.getTrickLevel() == 40, "No tricklevels are not the same");
    }
}