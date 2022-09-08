package homework8;

import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    static {
        System.out.println("Pet class is being loaded");
    }

    {
        System.out.println("New object of Pet class is being loaded");
    }
    private final Species species;
    private String nickname;
    private int age;
    private int trickLevel; // number from 1 to 100
    private Set<String> habits;

    public Pet(){
        this.species = Species.UNKNOWN;
    }

    public Pet(Species species){
        this.species = species;
    }

    public Pet(Species species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
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

    @Override
    public String toString() {
        return species.name() + "{" +
                "nickname='" + nickname + '\'' +
                ", age='" + age + '\'' +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(this.hashCode() == o.hashCode()) return true;
        if(this == o) return true;
        if(!(o instanceof Pet)) return false;

        Pet that  = (Pet) o;
        return this.age == that.age &&
                this.trickLevel == that.trickLevel &&
                 Objects.equals(this.species, that.species) &&
                  Objects.equals(this.nickname, that.nickname) &&
                   Objects.equals(this.habits, that.habits);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + species.hashCode();
        result = result * 31 + nickname.hashCode();
        result = result * 31 + age;
        result = result * 31 + trickLevel;
        result = result * 31 + habits.hashCode();
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

    public Set<String> getHabits() {
        return habits;
    }
}
