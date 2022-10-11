package homework8;

import java.util.Set;

public class Dog extends Pet implements Foulable {
    public Dog(boolean nothing){
        // special constructor only for creating UNKNOWN species pet
        super();
    }

    public Dog() {
        super(Species.DOG);
    }

    public Dog(String nickname) {
        super(Species.DOG, nickname);
    }

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(Species.DOG, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + super.getNickname() + ". I miss you!");
    }

    @Override
    public void foul(){
        System.out.println("I need to cover it up");
    }
}
