package homework7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FamilyTest {
    Family family1;
    Human family1Mother, family1Father, family1Child1, family1Child2, family1Child3;
    Pet dog1;

    @BeforeEach
    void setUp() {
        family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new String[][]{{DayOfWeek.MONDAY.name(), "go shopping"}});
        family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        family1 = new Family(family1Father, family1Mother);
        family1Child1 = new Human().bornChild(family1);
        family1Child2 = new Human().bornChild(family1);
        family1Child3 = new Human().bornChild(family1);
        family1.addChild(family1Child1);
        family1.addChild(family1Child2);
        family1.addChild(family1Child3);
        dog1 = new Dog("Ares");
        family1.setPet(dog1);
    }

    @Test
    @DisplayName("Testing count of family members")
    void test1() {
        assertEquals(family1.countFamily(), 6, "No count is not the same");
    }

    @Test
    @DisplayName("Testing deleteChild method")
    void test2() {
        family1.deleteChild(0);
        family1.deleteChild(family1Child2);
        assertEquals(family1.countFamily(), 4, "No count is not the same");
    }

    @Test
    void test3(){
        Human newChild = new Human().bornChild(family1);
        if(newChild instanceof Man){
            assertEquals(newChild.getSurname(), family1.getFather().getSurname()
                    ,"surnames are not the same");
        }
        else if(newChild instanceof Woman){
            assertEquals(newChild.getSurname(), family1.getMother().getSurname()
                    ,"surnames are not the same");
        }
    }
}