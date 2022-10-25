package homework9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class FamilyServiceTest {

    Human father1, mother1, child1, child2, child3, child4, father2, mother2;
    Pet pet1, pet2;
    Family family1;
    CollectionFamilyDao collectionFamilyDao;
    FamilyService familyService;
    FamilyController familyController;

    @BeforeEach
    void setUp() {
        father1 = new Human("Rovshan", "Huseynov", 1994);
        mother1 = new Human("Ayten", "Huseynova", 1995);
        child1 = new Human("Eli", "Huseynov", 2000);
        child2 = new Human("Veli", "Huseynov", 2005);
        child3 = new Human("Zeli", "Huseynov", 2010);
        child4 = new Human("Zahid", "Huseynov", 2010);
        father2 = new Human("Samir", "Veliyev", 1990);
        mother2 = new Human("Kemale", "Eliyeva", 1992);
        pet1 = new Dog("Alabash", 1, 100,
                new HashSet<String>(){{add("jump"); add("lick"); add("sleep");}});
        pet2 = new DomesticCat("Luna");

        family1 = new Family(father1, mother1);
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        List<Family> familyList = new ArrayList<>();
        familyList.add(family1);

        collectionFamilyDao = new CollectionFamilyDao(familyList);
        familyService = new FamilyService(collectionFamilyDao);
        familyController = new FamilyController(familyService);
    }

    @Test
    void getAllFamilies() {
        List<Family> excepted = Arrays.asList(family1);
        Assertions.assertEquals(excepted, familyController.getAllFamilies());
    }

    @Test
    void getFamiliesBiggerThan() {
        List<Family> excepted = Arrays.asList(family1);
        Assertions.assertEquals(excepted, familyController.getFamiliesBiggerThan(1));
    }

    @Test
    void getFamiliesLessThan() {
        List<Family> excepted = new ArrayList<>();
        Assertions.assertEquals(excepted, familyController.getFamiliesLessThan(1));
    }

    @Test
    void countFamiliesWithMemberNumber() {
        Assertions.assertEquals(1, familyController.countFamiliesWithMemberNumber(5));
    }

    @Test
    void createNewFamily() {
    }

    @Test
    void deleteFamilyByIndex() {
    }

    @Test
    void bornChild() {
    }

    @Test
    void adoptChild() {
    }

    @Test
    void deleteAllChildrenOlderThan() {
    }

    @Test
    void count() {
    }

    @Test
    void getFamilyById() {
    }

    @Test
    void getPets() {
    }

    @Test
    void addPet() {
    }
}