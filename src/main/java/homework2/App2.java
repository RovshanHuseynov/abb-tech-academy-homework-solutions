package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("All set. Get ready to rumble!");
        int target = (int) (Math.random() * 25);
        char[][] board = new char[6][6];
        fillBoard(board, target);
        printBoard(board);

        while(true){
            System.out.print("Enter a line for fire: ");
            int row = validateAndGetNumber(in);

            System.out.print("Enter a shooting bar: ");
            int column = validateAndGetNumber(in);

            if(board[row][column] == 'x'){
                System.out.println("You have won!");
                break;
            } else {
                board[row][column] = '*';
            }

            printBoard(board);
        }
    }

    private static int validateAndGetNumber(Scanner in){
        while(true){
            try {
                int number = in.nextInt();

                if (number >= 1 && number <= 5) {
                    return number;
                } else {
                    System.out.print("Please enter digit in the range of playing field lines (1-5): ");
                }
            } catch (InputMismatchException e){
                System.out.print("Please enter digit in the range of playing field lines (1-5): ");
                in.next();
            }
        }
    }

    private static void fillBoard(char[][] board, int target){
        for(int i=1; i<6; i++){
            for(int j=1; j<6; j++) {
                board[i][j] = '-';
            }
        }

        int cnt = 0;
        for(int i=1; i<6; i++){
            for(int j=1; j<6; j++) {
                cnt++;
                if(cnt == target){
                    board[i][j] = 'x';
                }
            }
        }
    }

    private static void printBoard(char[][] board){
        for(int i=0; i<6; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();

        for(int i=1; i<6; i++){
            System.out.print(i + " | ");
            for(int j=1; j<6; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }
}