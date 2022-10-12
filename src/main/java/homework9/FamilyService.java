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

    public int countFamiliesWithMemberNumber(){
        return 0;
    }

    public void createNewFamily(Human father, Human mother){
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
