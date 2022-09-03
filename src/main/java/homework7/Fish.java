package homework7;

public class Fish extends Pet{
    public Fish() {
        super(Species.FISH);
    }

    public Fish(String nickname) {
        super(Species.FISH, nickname);
    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.FISH, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + super.getNickname() + ". I miss you!");
    }
}
