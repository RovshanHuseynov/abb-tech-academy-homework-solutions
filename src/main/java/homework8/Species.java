package homework8;

public enum Species {
    DOG(false, 4, true),
    CAT(false, 4, true),
    PARROT(true, 2, false),
    CHICKEN(false, 2, false),
    FISH(false, 0, false),
    DOMESTIC_CAT(false, 4, true),
    ROBO_CAT(false, 4,true),
    UNKNOWN();

    private boolean canFly;
    private int numberOfLegs;
    private boolean hasFur;

    Species(){
    }

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return  this.name() + "{" +
                "canFly=" + canFly +
                ", numberOfLegs=" + numberOfLegs +
                ", hasFur=" + hasFur +
                '}';
    }
}
