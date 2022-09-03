package homework7;

public class Dog extends Pet{
    public Dog() {
        super();
    }

    public Dog(String nickname) {
        super(Species.DOG, nickname);
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.DOG, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + super.getNickname() + ". I miss you!");
    }
}
