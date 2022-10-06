package homework9;

import java.util.List;

public class FamilyService {
    private final FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public List<Family> getAllFamilies(){
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies(){
        familyDao.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(){
        return null;
    }

    public List<Family> getFamiliesLessThan(){
        return null;
    }

    public int countFamiliesWithMemberNumber(){
        return 0;
    }

    public void createNewFamily(Human father, Human mother){
    }

    /*
    getAllFamilies - to get a list of all the families.
    displayAllFamilies - to put all the families on the screen (in the indexed list) with all the family members.
    getFamiliesBiggerThan - to find family with number of people more than (takes the number of people and returns all families where the number of people is greater than specified); displays the information on the screen.
    getFamiliesLessThan - to find family with number of people less than (takes the number of people and returns all families where the number of people is less than specified); выводит информацию на экран.
    countFamiliesWithMemberNumber - to calculate the number of families with the number of people equal to the number of transfered people.
    createNewFamily - create a new family ( takes two parameters of Human type) - create a new family, saves in database.
            deleteFamilyByIndex - to delete a family by its index in the list - deletes the family fron database.
            bornChild - to give a birth to a child's family (takes Family and two String types: masculine and feminine) - a new child is born in the given family taking into account the parents' data, the information about the family is updated in the database; the method returns the renewed family. If the child is born a boy, it is given a male name, if the girl is female.
    adoptChild - to adopt child (takes two types: Family, Human)- the child is kept in the given family, the information about the family is updated in the database; the method returns the renewed family.
    deleteAllChildrenOlderThen - to delete all children older than (takes int) - in all families, children over the specified age are removed and the information is updated in the database.
            count - returns the number of families in the database.
    getFamilyById - takes the family index, returns Family as specified index.
    getPets - takes the family index, returns the list of pets that live in the family.
            addPet - takes family index and Pet parameter - adds a new pet to the family, updates the data in the database.*/
}
