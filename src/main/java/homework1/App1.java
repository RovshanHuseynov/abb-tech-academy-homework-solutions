package homework1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] guessedNumbers = new int[100];
        int target = (int) (Math.random() * 100), guess, index = 0;

        System.out.print("Please enter your name: ");
        String name = in.nextLine();

        System.out.println("Let the game begin!");
        while (true) {
            System.out.print("Please enter your guessed number: ");
            try {
                guess = in.nextInt();
                guessedNumbers[index++] = guess;

                if (guess > target) {
                    System.out.println("Your number is too big. Please, try again.");
                } else if (guess < target) {
                    System.out.println("Your number is too small. Please, try again.");
                } else {
                    System.out.printf("Congratulations, {%s}!\n", name);
                    System.out.print("Your numbers: ");

                    sortArray(guessedNumbers);
                    printArray(guessedNumbers, index);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Only digits should be entered!");
                in.next();
            }
        }
    }

    private static void printArray(int[] guessedNumbers, int index) {
        for (int i = 0; i < index - 1; i++) {
            System.out.print(guessedNumbers[i] + ", ");
        }
        System.out.println(guessedNumbers[index - 1]);
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}