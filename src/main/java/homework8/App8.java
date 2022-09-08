package homework8;

import java.util.HashMap;
import java.util.HashSet;

public class App8 {
    public static void main(String[] args) {
        System.out.println("\n---------------- Family1 ------------------------");
        Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80,
                new HashMap<DayOfWeek, String>() {{put(DayOfWeek.MONDAY, "go shopping");}});
        Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        Family family1 = new Family(family1Father, family1Mother);
        System.out.println(family1);

        Human family1Child1 = new Human().bornChild(family1);
        Human family1Child2 = new Human().bornChild(family1);
        Human family1Child3 = new Human().bornChild(family1);
        System.out.println("is child1 added: " + family1.addChild(family1Child1));
        System.out.println("is child2 added: " + family1.addChild(family1Child2));
        System.out.println("is child3 added: " + family1.addChild(family1Child3));
        Pet cat1 = new DomesticCat("Luna", 2, 30,
                new HashSet<String>(){{add("jump"); add("lick"); add("sleep");}});
        System.out.println("is cat1 added: " + family1.addPet(cat1));
        System.out.println("Family1 Count is: " + family1.countFamily());
        System.out.println(family1);
    }
}
