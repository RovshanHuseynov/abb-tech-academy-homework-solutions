package homework9;

import java.util.Map;

public final class Woman extends Human {
    public Woman() {
        super();
    }

    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Woman(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    public void makeup(){
        System.out.println("Let's have some makeup");
    }

    @Override
    public void greetPet() {
        System.out.println("I am a woman and greeting my Pet");
    }
}
