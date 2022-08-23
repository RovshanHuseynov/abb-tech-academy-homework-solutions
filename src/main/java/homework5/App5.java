package homework5;

public class App5 {
    public static void main(String[] args) {
        Human mother1 = new Human("Anna", "Valiyeva", 1975);
        Human father1 = new Human("John", "Robertson", 1970);
        Human child1 = new Human("Silva", "Robertson", 2000);
        Human child2 = new Human("Jessica", "Robertson", 2001);
        Human child3 = new Human("Alexey", "Gorbacov", 1970, 55,
                new String[][]{ {"Monday", "Go to work"}, {"Tuesday", "Workout"}});
        Pet pet1  = new Pet("dog", "luna");

        System.out.println(child3);
        System.out.println(mother1.hashCode());
        System.out.println(father1.hashCode());
        System.out.println(child1.hashCode());
        System.out.println(child2.hashCode());
        System.out.println(child1.equals(child2));

        Family family1 = new Family(father1, mother1);
        System.out.println(family1);
    }
}