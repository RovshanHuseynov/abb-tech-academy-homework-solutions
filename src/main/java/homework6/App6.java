package homework6;

public class App6 {
    public static void main(String[] args) throws Throwable {
        Family family1 = new Family(new Human(), new Human());
        family1 = null;
        System.gc();

        Human human1 = new Human("Rovshan", "Huseynov", 1994, 90,
                new String[][] {
                        {DayOfWeek.MONDAY.name(), "go to work"},
                        {DayOfWeek.TUESDAY.name(), "workout"},
                        {DayOfWeek.WEDNESDAY.name(), "go to the party"}
                } );

        System.out.println(human1);
    }
}