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

        /*System.out.println("1: " + getFebruary(1));
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
        System.out.println("12: " + getFebruary(12));*/

        fill2DArrayWithoutIfAndFor (5, 10);
    }

    public static int getNumberOfDays(int month) {
        return 30 + (month + month / 8) % 2;

        //return 30 + (month / 8) + (1 - 2 * (month / 8)) * (month % 2);

        /*if(month < 8)
            return 30 + 0 + 1 * (month % 2);
        else
            return 30 + 1 + (-1) * (month % 2);*/

        //return 30 + (month / 8) + (1 - 2 * (month / 8)) * (month % 2);

        /*if(month == 2){
            return 30 + (month / 8) + (1 - 2 * (month / 8)) * (month % 2) - 2;
        } else {
            return 30 + (month / 8) + (1 - 2 * (month / 8)) * (month % 2);
        }*/
    }

    public static int getFebruary(int month) {
        if (month == 2)
            return 1;
        else
            return 0;
    }

    public static void fill2DArrayWithoutIfAndFor(int n, int m) {
        int[][] array = new int[n][m];

        int cnt = 1;
        for (int i = 0; i < n * m; i++) {
            array[i / m][ i % m] = cnt++;
        }

        printArray(n, m , array);
    }

    public static void printArray(int n, int m, int[][] array) {
        for (int i = 0; i < n; i++) {
            if(i%2==0) {
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println(array[i][m - 1]);
            } else{
                for (int j = m-1; j > 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println(array[i][0]);
            }
        }
    }
}