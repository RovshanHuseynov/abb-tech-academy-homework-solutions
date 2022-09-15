package homework9;

import java.util.List;

public interface FamilyDao {
    List<Family> getAllFamilies();

    void displayAllFamilies();
    Family getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
    void saveFamily(Family family);
}