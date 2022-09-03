package homework7;

public class App7 {
    public static void main(String[] args) throws Throwable {
        Pet dog1 = new Dog("Ares");
        System.out.println(dog1);
        Pet cat1 = new DomesticCat("Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        Pet dog2 = new Dog("Zeus", 3, 20, new String[]{"bark", "run fast", "smell well"});
        Pet cat2 = new DomesticCat("Luna", 2, 30, new String[]{"jump", "lick", "sleep"});

        System.out.println("\n---------------- Family1 ------------------------");
        Human family1Mother = new Human("Sevinc", "Huseynova", 1967, 80, new String[][]{{DayOfWeek.MONDAY.name(), "go shopping"}});
        Human family1Father = new Human("Mirze", "Huseynov", 1965, 90);
        Family family1 = new Family(family1Father, family1Mother);

        Human family1Child1 = new Human().bornChild(family1);
        Human family1Child2 = new Human().bornChild(family1);
        Human family1Child3 = new Human().bornChild(family1);
        Human family1Child4 = new Human().bornChild(family1);
        family1Child4.setSchedule(new String[][]{{DayOfWeek.MONDAY.name(), "do homework"}, {DayOfWeek.SUNDAY.name(), "have a rest"}});
        Human family1Child5 = new Human().bornChild(family1);
        family1Child5.setSchedule(new String[][]{{DayOfWeek.TUESDAY.name(), "workout"}, {DayOfWeek.SUNDAY.name(), "watch a film"}});
        Human family1Child6 = new Human().bornChild(family1);
        family1Child6.setSchedule(new String[][]{{DayOfWeek.WEDNESDAY.name(), "go to club"}, {DayOfWeek.SUNDAY.name(), "sing a song"}});
        Human family1Child7 = new Human().bornChild(family1);
        family1Child7.setSchedule(new String[][]{{DayOfWeek.THURSDAY.name(), "go outside"}, {DayOfWeek.TUESDAY.name(), "go to dance club"}, {DayOfWeek.SUNDAY.name(), "meet friends"}});
        Human family1Child8 = new Human().bornChild(family1);
        family1Child8.setSchedule(new String[][]{{DayOfWeek.FRIDAY.name(), "sleep"}, {DayOfWeek.SATURDAY.name(), "play football"}, {DayOfWeek.SUNDAY.name(), "visit another city"}});

        System.out.println(family1Child1);
        System.out.println(family1Child2);
        System.out.println(family1Child3);
        System.out.println(family1Child4);
        System.out.println(family1Child5);
        System.out.println(family1Child6);
        System.out.println(family1Child7);
        System.out.println(family1Child8);

        family1.addChild(family1Child1);
        family1.addChild(family1Child2);
        family1.addChild(family1Child3);
        family1.addChild(family1Child4);
        family1.addChild(family1Child5);
        family1.addChild(family1Child6);
        family1.addChild(family1Child7);
        family1.addChild(family1Child8);
        family1.setPet(dog1);
        System.out.println("Family1 Count is: " + family1.countFamily());
        System.out.println(family1);
        System.out.println("is family1Child4 deleted: " + family1.deleteChild(family1Child4));
        System.out.println("is family1Child4 deleted: " + family1.deleteChild(family1Child4));
        System.out.println("is index 5 child deleted: " + family1.deleteChild(5));
        System.out.println("Family1 Count is: " + family1.countFamily());
        System.out.println(family1);


        System.out.println("\n---------------- Family2 ------------------------");
        Human family2Mother = new Human("Ayise", "Agayeva", 1950);
        Human family2Father = new Human("Samir", "Agayev", 1945);
        Family family2 = new Family(family2Father, family2Mother);

        Human family2Child1 = new Human().bornChild(family2);
        Human family2Child2 = new Human().bornChild(family2);
        family2.addChild(family2Child1);
        System.out.println("New Child Added! Family2 Count is: " + family2.countFamily());
        family2.addChild(family2Child2);
        System.out.println("New Child Added! Family2 Count is: " + family2.countFamily());
        family2.setPet(dog2);

        System.out.println("Pet Added! Welcome " + dog2.getNickname());
        System.out.print("eat method: ");
        dog2.eat();
        System.out.print("respond method: ");
        dog2.respond();
        System.out.println("Family2 Count is: " + family2.countFamily());
        System.out.println(family2);


        System.out.println("\n---------------- Family3 ------------------------");
        Human family3Mother = new Human("Lale", "Melikova", 1950);
        Human family3Father = new Human("Zamiq", "Melikov", 1945);
        Family family3 = new Family(family3Father, family3Mother);

        Human family3Child1 = new Human().bornChild(family3);
        Human family3Child2 = new Human().bornChild(family3);
        family3.addChild(family3Child1);
        System.out.println("New Child Added! Family Count is: " + family3.countFamily());
        family3.addChild(family3Child2);
        System.out.println("New Child Added! Family Count is: " + family3.countFamily());
        family3.setPet(cat1);
        System.out.println("Pet Added! Welcome " + cat1.getNickname());
        System.out.println(family3.getPet().toString());
        System.out.println("Family3 Count is: " + family3.countFamily());
        System.out.println("is index 1 child deleted? " + family3.deleteChild(1));
        System.out.println("Family3 Count is: " + family3.countFamily());
        System.out.println(family3);

        if(family3Child1 instanceof Man){
            ((Man) family3Child1).repairCar();
        } else {
            ((Woman) family3Child1).makeup();
        }

        family3.getPet().eat();
        family3.getPet().respond();
        cat1.eat();
        System.out.println(family3.getPet().toString());
        System.out.println(family3.getPet());


        System.out.println("\n---------------- Dog3 ------------------------");
        Dog dog3 = new Dog("Rick", 1, 40,
                new String[]{"jump", "lick", "smell", "play", "bark"});
        System.out.println(dog3);
        dog3.foul();
        System.out.println(dog3.getSpecies());

        System.out.println("\n---------------- UNKNOWN --------------------");
        Pet dog4 = new Dog(false);
        System.out.println(dog4);
    }
}
