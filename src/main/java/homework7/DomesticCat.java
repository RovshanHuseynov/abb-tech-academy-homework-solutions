package homework7;

public class DomesticCat extends Pet{
    public DomesticCat() {
        super();
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
}
