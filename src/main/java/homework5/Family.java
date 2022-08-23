package homework5;

import java.util.Arrays;

public class Family {
    private Human father;
    private Human mother;
    private Human[] child;
    private Pet pet;

    public Family(Human father, Human mother, Human[] child, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.child = child;
        this.pet = pet;
    }

    public String deleteChild(Human child){
        return child.getName() + " is successfully deleted";
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
