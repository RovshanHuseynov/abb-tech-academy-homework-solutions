package homework4;

public class App4 {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        Pet pet2 = new Pet("dog", "Rex");
        Pet pet3 = new Pet("cat", "Luna", 2, 75, new String[]{"eat", "play", "sleep"});

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);
        System.out.println();

        pet1.eat();
        pet2.respond();
        pet3.foul();
        System.out.println();

        Human mother1 = new Human("Anna", "Valiyeva", 1975);
        Human father1 = new Human("John", "Robertson", 1970);
        Human child1 = new Human("Silva", "Robertson", 2000, father1, mother1);
        Human child2 = new Human("Jessica", "Robertson", 2001, 70, pet3, mother1, father1,
                new String[][]{{"Monday", "Go to the school"},{"Tuesday", "Go to the dance club"}});

        System.out.println(mother1);
        System.out.println(father1);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println();

        child2.greetPet();
        child2.describePet();
    }
}