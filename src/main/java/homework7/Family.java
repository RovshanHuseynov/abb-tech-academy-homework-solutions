package homework7;

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
    private Human[] children;
    private Pet pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new Human[10];
    }

    public boolean addChild(Human child){
        reFillChildrenArray();
        int len = this.children.length;

        for(int i=0; i<len; i++){
            if(this.children[i] == null){
                this.children[i] = child;
                return true;
            }
        }
        return false;
    }

    public boolean deleteChild(Human child){
        int len = this.children.length;

        for(int i=0; i<len; i++){
            if(this.children[i].hashCode() == child.hashCode() && this.children[i].equals(child)){
                this.children[i] = null;
                reFillChildrenArray();
                return true;
            }
        }
        return false;
    }

    public boolean deleteChild(int index){
        if(index >= this.children.length){
            return false;
        }

        if(this.children[index] == null){
            return false;
        }

        this.children[index] = null;
        reFillChildrenArray();
        return true;
    }

    public int countFamily(){
        int cntFamilyMembers = 2;
        int lenChild = this.children.length;

        for(int i=0; i<lenChild; i++){
            if(this.children[i] != null) cntFamilyMembers++;
        }

        if(this.pet != null) cntFamilyMembers++;

        return cntFamilyMembers;
    }

    public void reFillChildrenArray(){
        for(int i=1; i<this.children.length; i++){
            if(this.children[i-1] == null){
                this.children[i-1] = this.children[i];
                this.children[i] = null;
            }
        }
    }

    @Override
    public String toString() {
        return "Family {" +
                "father=" + father +
                ", mother=" + mother +
                ", child=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(father, family.father) && Objects.equals(mother, family.mother) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(father, mother, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Inside finalize method of Family class");
        } catch (Throwable e){
            throw e;
        } finally {
            System.out.println("Calling finalize method of the Object class from Family class");
            super.finalize();
        }
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }
}
