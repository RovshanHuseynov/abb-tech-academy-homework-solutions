package homework10;

import java.util.List;
import java.util.Random;
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

    public Family bornChild(Family family){
        String[] manNames = {"Samir", "Amil", "Kamil", "Letif", "Eli", "Arif", "Ehed", "Anar", "Nadir", "Emil", "Ilkin", "Amal"};
        String[] womanNames = {"Lale", "Kemale", "Fidan", "Nergiz", "Sunbul", "Lamiye", "Aydan", "Sedaqet", "Leyla", "Guler", "Jale", "Leman"};

        Random random = new Random();
        int childSex = random.nextInt(2);
        if(childSex == 0){
            family.addChild(new Man(manNames[random.nextInt(12)],
                    family.getFather().getSurname(),
                    1990 + random.nextInt(20),
                    (family.getFather().getIq() + family.getMother().getIq()) / 2));
        } else if(childSex == 1){
            family.addChild(new Woman(womanNames[random.nextInt(12)],
                    family.getMother().getSurname(),
                    1990 + random.nextInt(20),
                    (family.getFather().getIq() + family.getMother().getIq()) / 2));
        }

        familyDao.saveFamily(family);
        return family;
    }

    public Family adoptChild(Family family, Human child){
        family.addChild(child);
        familyDao.saveFamily(family);
        return family;
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyDao.getAllFamilies()
                .forEach(family -> {
                    List<Human> notNeededChildrenList = family.getChildren()
                            .stream()
                            .filter(child -> 2022 - child.getYear() > age)
                            .collect(Collectors.toList());

                    notNeededChildrenList.forEach(family::deleteChild);
                    familyDao.saveFamily(family);
                });
    }

    public int count(){
        return familyDao.getAllFamilies().size();
    }

    public Family getFamilyById(int index){
        return familyDao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int index){
        return familyDao.getFamilyByIndex(index).getPets();
    }

    public void addPet(int index, Pet pet){
        Family family = familyDao.getFamilyByIndex(index);
        family.addPet(pet);
        familyDao.saveFamily(family);
    }
}
