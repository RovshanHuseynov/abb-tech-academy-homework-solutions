package homework8;

import java.util.*;

public class Family {
    static {
        System.out.println("Family class is being loaded");
    }

    {
        System.out.println("New object of Family class is being loaded");
    }

    private Human father;
    private Human mother;
    private List<Human> children;
    private Set<Pet> pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>();
        this.pet = new HashSet<>();
    }

    public boolean addChild(Human child){
        return children.add(child);
    }

    public boolean deleteChild(Human child){
        return children.remove(child);
    }

    public boolean deleteChild(int index){
        if(index < 0 || index >= children.size()) return false;
        children.remove(index);
        return true;
    }

    public int countFamily() {
        int cntFamilyMembers = this.children.size() + 2;
        if (this.pet != null) cntFamilyMembers++;
        return cntFamilyMembers;
    }

    @Override
    public String toString() {
        return "Family {" +
                "father=" + father +
                ", mother=" + mother +
                ", child=" + children.toString() +
                ", pet=" + pet.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(this.hashCode() == o.hashCode()) return true;
        if (this == o) return true;
        if(!(o instanceof Family)) return false;

        Family that = (Family) o;
        return Objects.equals(this.father, that.father) &&
                Objects.equals(this.mother, that.mother) &&
                 Objects.equals(this.pet, that.pet) &&
                  Objects.equals(this.children, that.children);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + father.hashCode();
        result = result * 31 + mother.hashCode();
        result = result * 31 + children.hashCode();
        result = result * 31 + pet.hashCode();
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

    public List<Human> getChildren() {
        return children;
    }

    public void setPet(Set<Pet> pet){
        this.pet = pet;
    }

    public Set<Pet> getPet() {
        return pet;
    }
}
