package homework9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

class FamilyServiceTest {

    Human father1, mother1, child1, child2, child3, child4, father2, mother2;
    Pet pet1, pet2;
    Family family1;
    CollectionFamilyDao collectionFamilyDao;
    FamilyService familyService;
    FamilyController familyController;

    @BeforeEach
    void setUp() {
        father1 = new Human("Rovshan", "Huseynov", 1994, 70);
        mother1 = new Human("Ayten", "Huseynova", 1995, 20);
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
        familyController.createNewFamily(father2, mother2);
        Assertions.assertEquals(2, familyController.count());
    }

    @Test
    void deleteFamilyByIndex() {
        Assertions.assertEquals(false, familyController.deleteFamilyByIndex(3));
    }

    @Test
    void bornChild() {
        int oldCount = familyController.getFamilyById(0).countFamily();
        familyController.bornChild(family1);
        familyController.bornChild(family1);
        int newCount = familyController.getFamilyById(0).countFamily();
        Assertions.assertTrue(newCount == oldCount + 2);
    }

    @Test
    void adoptChild() {

    }

    @Test
    void deleteAllChildrenOlderThan(){
        int oldCount = familyController.getFamilyById(0).countFamily();
        familyController.deleteAllChildrenOlderThan(20);
        int newCount = familyController.getFamilyById(0).countFamily();
        Assertions.assertTrue(newCount == oldCount - 1);
    }

    @Test
    void count() {
        Assertions.assertEquals(1, familyController.count());
    }

    @Test
    void getFamilyById() {
        Assertions.assertEquals(family1, familyController.getFamilyById(0));
    }

    @Test
    void getPets() {
        familyController.addPet(0, pet2);
        Set<Pet> pets = familyController.getFamilyById(0).getPets();
        Assertions.assertEquals(pets, familyController.getPets(0));
    }

    @Test
    void addPet() {
        int cnt1 = family1.getPets().size();
        familyController.addPet(0, pet2);
        int cnt2 = family1.getPets().size();
        Assertions.assertTrue(cnt2 == cnt1 + 1);
    }
}