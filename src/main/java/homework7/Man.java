package homework7;

public final class Man extends Human{
    public void repairCar(){
        System.out.println("I am repairing my car");
    }

    @Override
    public void greetPet() {
        System.out.println("I am a man and greeting my Pet");
    }
}
