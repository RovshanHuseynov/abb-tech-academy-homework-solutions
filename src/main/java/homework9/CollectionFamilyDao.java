package homework9;

import java.util.List;
import java.util.Optional;

public class CollectionFamilyDao implements FamilyDao{
    private List<Family> families;

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public void displayAllFamilies(){
        System.out.println("displayAllFamilies");
        families.stream()
                .forEach(System.out::println);
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if(index < 0 || index >= families.size()){
            return null;
        }
        return families.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        if(index < 0 || index >= families.size()){
            return false;
        }
        families.remove(index);
        return true;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return families.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
        boolean isSaved = false;

        for(int i=0; i<families.size(); i++){
            if(this.families.get(i).getFather().equals(family.getFather())
                    && this.families.get(i).getMother().equals(family.getMother())){
                this.families.set(i, family);
                isSaved = true;
            }
        }

        if(!isSaved) this.families.add(family);
    }
}
