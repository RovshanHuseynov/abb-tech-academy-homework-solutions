package homework3;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        fillScheduleArray(schedule);

        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.print("Please, input the day of the week: ");
            String userInput = in.nextLine();
            int dayOfWeek = getDayOfWeek(userInput);

            if(dayOfWeek == -1){
                if(!isChangeRequest(userInput, schedule, in)) {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
            } else if(dayOfWeek == 7){
                break;
            } else {
                System.out.println("Your tasks for " + userInput + " : " + schedule[dayOfWeek][1]);
            }
        }
    }

    private static void fillScheduleArray(String[][] schedule) {
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work; organise my new week";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "workout";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "play tennis";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "walk at the street";
        schedule[5][0] = "Friday";
        schedule[5][1] = "meet up with people";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "read book; sum up my former week";
    }

    private static int getDayOfWeek(String input){
        input = input.trim().toLowerCase();
        switch(input){
            case "sunday":
                return 0;
            case "monday":
                return 1;
            case "tuesday":
                return 2;
            case "wednesday":
                return 3;
            case "thursday":
                return 4;
            case "friday":
                return 5;
            case "saturday":
                return 6;
            case "exit":
                return 7;
            default:
                return -1;
        }
    }

    private static boolean isChangeRequest(String input, String[][] schedule, Scanner in){
        if(input.startsWith("change ")){
            input = input.substring(7);
            if(getDayOfWeek(input) != -1 && getDayOfWeek(input) != 7){
                System.out.print("Please, input new tasks for the day: ");
                schedule[getDayOfWeek(input)][1] = in.nextLine();
                return true;
            }
        }
        else if(input.startsWith("reschedule ")){
            input = input.substring(11);
            if(getDayOfWeek(input) != -1 && getDayOfWeek(input) != 7){
                System.out.print("Please, input new tasks for the day: ");
                schedule[getDayOfWeek(input)][1] = in.nextLine();
                return true;
            }
        }
        return false;
    }
}