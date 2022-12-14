package homework5;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    static {
        System.out.println("Pet class is being loaded");
    }

    {
        System.out.println("New object of Pet class is being loaded");
    }
    private String species;
    private String nickname;
    private int age;
    private int trickLevel; // number from 1 to 100
    private String[] habits;

    public Pet(){
    }

    public Pet(String species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }

    public void respond(){
        System.out.println("Hello, owner. I am - " + nickname + ". I miss you!");
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return species + "{" +
                "nickname='" + nickname + '\'' +
                ", age='" + age + '\'' +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if (this == o) return true;
        if(!(o instanceof Pet)) return false;

        Pet that = (Pet) o;
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

    public String getSpecies() {
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
