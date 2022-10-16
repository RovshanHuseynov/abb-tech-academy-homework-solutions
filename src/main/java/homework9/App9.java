package homework9;

import java.util.ArrayList;
import java.util.List;

public class App9 {
    public static void main(String[] args) {
        List<Family> familyList = new ArrayList<>();
        Human father = new Human("Rovshan", "Huseynov", 1994);
        Human mother = new Human("Ayten", "Huseynova", 1995);
        Human child1 = new Human("Eli", "Huseynov", 2000);
        Human child2 = new Human("Veli", "Huseynov", 2005);
        Human child3 = new Human("Zeli", "Huseynov", 2010);
        Family family1 = new Family(father, mother);
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        familyList.add(family1);

        CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao(familyList);
        FamilyService familyService = new FamilyService(collectionFamilyDao);
        FamilyController familyController = new FamilyController(familyService);
        System.out.println("Family list before deletion");
        familyController.displayAllFamilies();
        familyController.deleteAllChildrenOlderThan(10);
        System.out.println("Family size after deletion");
        familyController.displayAllFamilies();
    }
}
