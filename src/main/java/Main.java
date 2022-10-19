public class Main {
    public static void main(String[] args) {
        /*System.out.println("1: " + getNumberOfDays(1));
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
        System.out.println("12: " + getNumberOfDays(12));*/

        System.out.println("1: " + getFebruary(1));
        System.out.println("2: " + getFebruary(2));
        System.out.println("3: " + getFebruary(3));
        System.out.println("4: " + getFebruary(4));
        System.out.println("5: " + getFebruary(5));
        System.out.println("6: " + getFebruary(6));
        System.out.println("7: " + getFebruary(7));
        System.out.println("8: " + getFebruary(8));
        System.out.println("9: " + getFebruary(9));
        System.out.println("10: " + getFebruary(10));
        System.out.println("11: " + getFebruary(11));
        System.out.println("12: " + getFebruary(12));
    }

    public static int getNumberOfDays(int month){
        /*if(month < 8)
            return 30 + 0 + 1 * (month % 2);
        else
            return 30 + 1 + (-1) * (month % 2);*/

        //return 30 + (month / 8) + (1 - 2 * (month / 8)) * (month % 2);

        if(month == 2){
            return 30 + (month / 8) + (1 - 2 * (month / 8)) * (month % 2) - 2;
        } else {
            return 30 + (month / 8) + (1 - 2 * (month / 8)) * (month % 2);
        }
    }

    public static int getFebruary(int month){
        if(month == 2)
            return 1;
        else
            return 0;
    }
}