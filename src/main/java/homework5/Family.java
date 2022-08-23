package homework5;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human father;
    private Human mother;
    private Human[] child;
    private Pet pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.child = new Human[10];
    }

    public void addChild(Human child){
        int len = this.child.length;

        for(int i=0; i<len; i++){
            if(this.child[i] == null){
                this.child[i] = child;
            }
        }
        refillChildArray();
    }

    public boolean deleteChild(Human child){
        int len = this.child.length;

        for(int i=0; i<len; i++){
            if(Objects.equals(this.child[i], child)){
                this.child[i] = null;
                refillChildArray();
                return true;
            }
        }
        refillChildArray();
        return false;
    }

    public int countFamily(){
        int cntFamilyMembers = 2;
        int lenChild = this.child.length;

        for(int i=0; i<lenChild; i++){
            if(this.child[i] != null) cntFamilyMembers++;
        }

        if(this.pet != null) cntFamilyMembers++;

        return cntFamilyMembers;
    }

    public void refillChildArray(){
        int lenCurrentChildArray = this.child.length;
        Human[] childNew = new Human[lenCurrentChildArray];
        int indexChildNew = 0;

        for(int i=0; i<lenCurrentChildArray; i++){
            if(this.child[i] != null){
                childNew[indexChildNew++] = this.child[i];
            }
        }

        this.child = childNew;
    }

    @Override
    public String toString() {
        return "Family {" +
                "father=" + father +
                ", mother=" + mother +
                ", child=" + Arrays.toString(child) +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(father, family.father) && Objects.equals(mother, family.mother) && Arrays.equals(child, family.child) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(father, mother, pet);
        result = 31 * result + Arrays.hashCode(child);
        return result;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Human[] getChild() {
        return child;
    }

    public Pet getPet() {
        return pet;
    }
}
