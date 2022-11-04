package homework12;

import java.util.List;
import java.util.Set;

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

    public List<Family> getFamiliesBiggerThan(int memberCount){
        return familyService.getFamiliesBiggerThan(memberCount);
    }

    public List<Family> getFamiliesLessThan(int memberCount){
        return familyService.getFamiliesLessThan(memberCount);
    }

    public long countFamiliesWithMemberNumber(int memberCount){
        return familyService.countFamiliesWithMemberNumber(memberCount);
    }

    public void createNewFamily(Human father, Human mother){
        familyService.createNewFamily(father, mother);
    }

    public boolean deleteFamilyByIndex(int index){
        return familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family){
        return familyService.bornChild(family);
    }

    public Family adoptChild(Family family, Human child){
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThan(int age){
        familyService.deleteAllChildrenOlderThan(age);
    }

    public int count(){
        return familyService.count();
    }

    public Family getFamilyById(int index){
        return familyService.getFamilyById(index);
    }

    public Set<Pet> getPets(int index){
        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet){
        familyService.addPet(index, pet);
    }
}
