package homework9;

import java.util.List;

public class FamilyController {
    private final FamilyService familyService;

    public FamilyController(FamilyService familyService){
        this.familyService = familyService;
    }

    public List<Family> getAllFamilies(){
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies(){
        familyService.displayAllFamilies();
    }

    public void deleteAllChildrenOlderThan(int age){
        familyService.deleteAllChildrenOlderThan(age);
    }
}
