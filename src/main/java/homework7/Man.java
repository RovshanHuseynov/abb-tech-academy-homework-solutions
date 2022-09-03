package homework7;

public final class Man extends Human{
    public Man() {
        super();
    }

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Man(String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    public void repairCar(){
        System.out.println("Let's repair my car");
    }

    @Override
    public void greetPet() {
        System.out.println("I am a man and greeting my Pet");
    }
}
