package homework7;

public class App7 {
    public static void main(String[] args) throws Throwable {
        Pet dog1 = new Dog("Ares");
        System.out.println(dog1);
        Pet cat1 = new DomesticCat("Luna", 2, 30, new String[]{"jump", "lick", "sleep"});
        Pet dog2 = new Dog("Zeus", 3, 20, new String[]{"bark", "run fast", "smell well"});
        Pet cat2 = new DomesticCat("Luna", 2, 30, new String[]{"jump", "lick", "sleep"});


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
        System.out.println(family1.countFamily());
        System.out.println(family1);
        System.out.println("is family1Child4 deleted: " + family1.deleteChild(family1Child4));
        System.out.println("is family1Child4 deleted: " + family1.deleteChild(family1Child4));
        System.out.println("is family1Child4 deleted: " + family1.deleteChild(5));
        System.out.println(family1.countFamily());
        System.out.println(family1);

        /*
        Human human1 = new Human("Rovshan", "Huseynov", 1994, 90,
                new String[][] {
                        {DayOfWeek.MONDAY.name(), "go to work"},
                        {DayOfWeek.TUESDAY.name(), "workout"},
                        {DayOfWeek.WEDNESDAY.name(), "go to the party"}
                } );

        System.out.println(human1);

        Pet pet1 = new Dog("Rick", 1, 40,
                new String[]{"jump", "lick", "smell", "play", "bark"});

        System.out.println(pet1);
        System.out.println(pet1.getSpecies());*/
    }
}
