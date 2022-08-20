package homework4;


public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq; // number from 1 to 100
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;    // day of the week, type of the activity

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
                ", mother=" + mother.name + " " + mother.surname +
                ", father=" + father.name + " " + father.surname +
                ", pet=" + pet +
                '}';
    }
}
