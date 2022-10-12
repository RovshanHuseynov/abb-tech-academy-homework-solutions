package homework9;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FamilyService {
    private final FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies(){
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies(){
        familyDao.getAllFamilies().forEach(System.out::println);
        System.out.println("------------------------------------------");
    }

    public List<Family> getFamiliesBiggerThan(int memberCount){
        return familyDao.getAllFamilies().stream()
                .filter(family -> family.countFamily() > memberCount)
                .collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int memberCount){
        return familyDao.getAllFamilies().stream()
                .filter(family -> family.countFamily() < memberCount)
                .collect(Collectors.toList());
    }

    public long countFamiliesWithMemberNumber(int memberCount){
        return familyDao.getAllFamilies().stream()
                .filter(family -> family.countFamily() == memberCount)
                .count();
    }

    public void createNewFamily(Human father, Human mother){
        Family family = new Family(father, mother);
        familyDao.saveFamily(family);
    }

    public boolean deleteFamilyByIndex(int index){
        return familyDao.deleteFamily(index);
    }

    public void bornChild(){
        // TODO implement it
    }

    public Family adoptChild(Family family, Human child){
        family.addChild(child);
        familyDao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThan(int age){
        // TODO fix this
        List<Human> children = familyDao.getAllFamilies().stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child -> 2022 - child.getYear() > age)
                .collect(Collectors.toList());
    }

    public int count(){
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index){
        return familyDao.getAllFamilies().get(index);
    }

    public Set<Pet> getPets(int index){
        return familyDao.getAllFamilies().get(index).getPets();
    }

    public void addPet(int index, Pet pet){
        Family family = familyDao.getAllFamilies().get(index);
        family.addPet(pet);
        familyDao.saveFamily(family);
    }
}
