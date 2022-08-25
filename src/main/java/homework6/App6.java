package homework6;

public class App6 {
    public static void main(String[] args) throws Throwable {
        Family family1 = new Family(new Human(), new Human());
        family1 = null;
        System.gc();
    }
}