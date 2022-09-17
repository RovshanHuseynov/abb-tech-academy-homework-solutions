package homework7;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human implements HumanCreator{
    static {
        System.out.println("Human class is being loaded");
    }

    {
        System.out.println("New object of Human class is being loaded");
    }
    private String name;
    private String surname;
    private int year;
    private int iq; // number from 1 to 100
    private String[][] schedule; // day of the week, type of the activity

    public Human(){
    }

    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public void greetPet(){
        System.out.println("I am greeting my Pet");
    }

    @Override
    public Human bornChild(Family family){
        String[] manNames = {"Samir", "Amil", "Kamil", "Letif", "Eli", "Arif", "Ehed", "Anar", "Nadir", "Emil", "Ilkin", "Amal"};
        String[] womanNames = {"Lale", "Kemale", "Fidan", "Nergiz", "Sunbul", "Lamiye", "Aydan", "Sedaqet", "Leyla", "Guler", "Jale", "Leman"};

        Random random = new Random();
        int childSex = random.nextInt(2);

        if(childSex == 0){
            return new Man(manNames[random.nextInt(12)],
                    family.getFather().getSurname(),
                    1990 + random.nextInt(20),
                    (family.getFather().iq + family.getMother().iq) / 2);
        } else if(childSex == 1){
            return new Woman(womanNames[random.nextInt(12)],
                    family.getMother().getSurname(),
                    1990 + random.nextInt(20),
                    (family.getFather().iq + family.getMother().iq) / 2);
        }

        return new Human();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        if(this == o) return true;
        if(!(o instanceof Human)) return false;

        Human that = (Human) o;
        return this.year == that.year &&
                this.iq == that.iq &&
                 Objects.equals(this.name, that.name) &&
                  Objects.equals(this.surname, that.surname) &&
                   Objects.deepEquals(this.schedule, that.schedule);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + name.hashCode();
        result = result * 31 + surname.hashCode();
        result = result * 31 + year;
        result = result * 31 + iq;
        result = result * 31 + Arrays.deepHashCode(schedule);
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Inside finalize method of Human class");
        } catch (Throwable e){
            throw e;
        } finally {
            System.out.println("Calling finalize method of the Object class from Human class");
            super.finalize();
        }
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

    public void setSchedule(String[][] schedule){
        this.schedule = schedule;
    }

    public String[][] getSchedule() {
        return schedule;
    }
}
