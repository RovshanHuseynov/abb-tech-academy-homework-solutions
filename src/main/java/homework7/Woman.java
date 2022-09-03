package homework7;

public final class Woman extends Human{
    public void makeup(){
        System.out.println("I am making up");
    }

    @Override
    public void greetPet() {
        System.out.println("I am a woman and greeting my Pet");
    }
}
