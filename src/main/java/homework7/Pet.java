package homework7;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    static {
        System.out.println("Pet class is being loaded");
    }

    {
        System.out.println("New object of Pet class is being loaded");
    }
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel; // number from 1 to 100
    private String[] habits;

    public Pet(){
    }

    public Pet(Species species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public abstract void respond();

    /*public void foul(){
        System.out.println("I need to cover it up");
    }*/

    @Override
    public String toString() {
        return species.name() + "{" +
                "nickname='" + nickname + '\'' +
                ", age='" + age + '\'' +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this.hashCode() == o.hashCode()) return true;
        if(this == o) return true;
        if(!(o instanceof Pet)) return false;

        Pet that  = (Pet) o;
        return this.age == that.age &&
                this.trickLevel == that.trickLevel &&
                 Objects.equals(this.species, that.species) &&
                  Objects.equals(this.nickname, that.nickname) &&
                   Arrays.equals(this.habits, that.habits);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + species.hashCode();
        result = result * 31 + nickname.hashCode();
        result = result * 31 + age;
        result = result * 31 + trickLevel;
        result = result * 31 + Arrays.hashCode(habits);
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Inside finalize method of Pet class");
        } catch (Throwable e){
            throw e;
        } finally {
            System.out.println("Calling finalize method of the Object class from Pet class");
            super.finalize();
        }
    }

    public Species getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }
}
