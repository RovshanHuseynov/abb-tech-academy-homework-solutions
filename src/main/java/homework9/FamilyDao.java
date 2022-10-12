package homework9;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();

    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
    void saveFamily(Family family);
    Family getFamilyByIndex(int index);
    //void displayAllFamilies();
}