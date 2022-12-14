package homework12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App12 {
    public static void main(String[] args) {
        List<Family> familyList = new ArrayList<>();
        Human father1 = new Human("Rovshan", "Huseynov", 1994);
        Human mother1 = new Human("Ayten", "Huseynova", 1995);
        Human child1 = new Human("Eli", "Huseynov", 2000);
        Human child2 = new Human("Veli", "Huseynov", 2005);
        Human child3 = new Human("Zeli", "Huseynov", 2010);
        Family family1 = new Family(father1, mother1);
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        familyList.add(family1);

        CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao(familyList);
        FamilyService familyService = new FamilyService(collectionFamilyDao);
        FamilyController familyController = new FamilyController(familyService);
        //System.out.println("Family list before deletion");
        //familyController.displayAllFamilies();
        //familyController.deleteAllChildrenOlderThan(20);
        //System.out.println("Family size after deletion");
        //familyController.displayAllFamilies();

        //familyController.getAllFamilies().forEach(System.out::println);
        //familyController.getFamiliesBiggerThan(1).forEach(System.out::println);
        //familyController.getFamiliesLessThan(1).forEach(System.out::println);
        //System.out.println("countFamiliesWithMemberNumber: " + familyController.countFamiliesWithMemberNumber(4));

        Human father2 = new Human("Samir", "Veliyev", 1990);
        Human mother2 = new Human("Kemale", "Eliyeva", 1992);
        familyController.createNewFamily(father2, mother2);
        //System.out.println("countAllFamilies: " + familyController.count());
        //familyController.displayAllFamilies();
        //System.out.println("countAllFamilies: " + familyController.count());
        //familyController.deleteFamilyByIndex(1);
        //familyController.displayAllFamilies();

        //System.out.println(familyController.getFamilyById(0));

        Pet pet1 = new Dog("Alabash", 1, 100,
                new HashSet<String>(){{add("jump"); add("lick"); add("sleep");}});
        familyController.addPet(0, pet1);
        // familyController.getPets(0).forEach(System.out::println);
        Pet pet2 = new DomesticCat("Luna");
        //System.out.println("pet2 :" + pet2);
        familyController.addPet(0, pet2);
        //familyController.getPets(0).forEach(System.out::println);
        //System.out.println(familyController.deleteFamilyByIndex(3));
        //System.out.println(familyController.deleteFamilyByIndex(0));

        //System.out.println("family1 count: " + family1.countFamily());
        familyController.bornChild(family1);
        //System.out.println("family1 count: " + family1.countFamily());
        Human child4 = new Human("Zeli", "Huseynov", 2010);
        familyController.adoptChild(family1, child4);
        //System.out.println("family1 count: " + family1.countFamily());

        System.out.println(family1.prettyFormat());
    }
}
