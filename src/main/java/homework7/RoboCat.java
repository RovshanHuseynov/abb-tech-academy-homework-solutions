package homework7;

public class RoboCat extends Pet implements Foulable{
    public RoboCat() {
        super(Species.ROBO_CAT);
    }

    public RoboCat(String nickname) {
        super(Species.ROBO_CAT, nickname);
    }

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.ROBO_CAT, nickname, age, trickLevel, habits);
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
