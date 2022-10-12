package homework9;

import java.util.List;
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

    public void adoptChild(Family family, Human human){

    }

    public Family getFamilyById(int id){
        return null;
    }

    public void deleteAllChildrenOlderThen(){

    }

    public List<Pet> getPets(){
        return null;
    }
}
