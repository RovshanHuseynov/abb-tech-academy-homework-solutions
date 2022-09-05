package homework8;

public class DomesticCat extends Pet implements Foulable {
    public DomesticCat() {
        super(Species.DOMESTIC_CAT);
    }

    public DomesticCat(String nickname) {
        super(Species.DOMESTIC_CAT, nickname);
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.DOMESTIC_CAT, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + super.getNickname() + ". I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("'I need to cover it up");
    }
}
