package homework5;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq; // number from 1 to 100
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;    // day of the week, type of the activity

    public Human(){
    }

    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet(){
        System.out.print("I have a " + pet.species + ", he is " + pet.age + " years old, he is ");

        if(pet.trickLevel > 50){
            System.out.println("very sly");
        } else {
            System.out.println("almost not sly");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + getHumanNameAndSurname(mother) +
                ", father=" + getHumanNameAndSurname(father) +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }

    private String getHumanNameAndSurname(Human human){
        if(human == null){
            return null;
        }
        return human.name + " " + human.surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public String[][] getSchedule() {
        return schedule;
    }
}
