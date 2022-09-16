package homework5;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    static {
        System.out.println("Family class is being loaded");
    }

    {
        System.out.println("New object of Family class is being loaded");
    }

    private Human father;
    private Human mother;
    private Human[] child;
    private Pet pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.child = new Human[10];
    }

    // TODO change Human child to int index
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
            if(this.child[i].hashCode() == child.hashCode() && this.child[i].equals(child)){
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
        if(this.hashCode() != o.hashCode()) return false;
        if (this == o) return true;
        if(!(o instanceof Family)) return false;

        Family that = (Family) o;
        return Objects.equals(this.father, that.father) &&
                Objects.equals(this.mother, that.mother) &&
                 Objects.equals(this.pet, that.pet) &&
                  Arrays.equals(this.child, that.child);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + father.hashCode();
        result = result * 31 + mother.hashCode();
        result = result * 31 + Arrays.hashCode(child);
        result = result * 31 + pet.hashCode();
        return result;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public void setChild(Human child){
        for(int i=0; i<this.child.length; i++){
            if(this.child[i] == null){
                this.child[i] = child;
                break;
            }
        }
    }

    public Human[] getChild() {
        return child;
    }

    public void setPet(Pet pet){
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
}
