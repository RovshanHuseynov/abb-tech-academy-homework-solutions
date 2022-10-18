public class Main {
    public static void main(String[] args) {
        System.out.println("1: " + getNumberOfDays(1));
        System.out.println("2: " + getNumberOfDays(2));
        System.out.println("3: " + getNumberOfDays(3));
        System.out.println("4: " + getNumberOfDays(4));
        System.out.println("5: " + getNumberOfDays(5));
        System.out.println("6: " + getNumberOfDays(6));
        System.out.println("7: " + getNumberOfDays(7));
        System.out.println("8: " + getNumberOfDays(8));
        System.out.println("9: " + getNumberOfDays(9));
        System.out.println("10: " + getNumberOfDays(10));
        System.out.println("11: " + getNumberOfDays(11));
        System.out.println("12: " + getNumberOfDays(12));
    }

    public static int getNumberOfDays(int month){
        if(month < 8)
            return 30 + (month % 2);
        else
            return 31 - (month % 2);
    }
}