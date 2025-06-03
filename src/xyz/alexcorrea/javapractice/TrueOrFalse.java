package xyz.alexcorrea.javapractice;

import java.util.Scanner;

public class TrueOrFalse {

    public static boolean getInputFromUser(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while(!scanner.hasNextBoolean()) {
            System.out.println("Not a valid option, try again!");
            scanner.next();
        }
        return scanner.nextBoolean();
    }

    public static String returnTrueOrFalse(boolean optionA, boolean optionB) {
        if(optionA && optionB) {
                return "Both are true";
            } else if(!optionA && !optionB){
                return "Both are false";
            } else {
                return "Options differ from each other";
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            boolean optionA = getInputFromUser(scanner, "Enter true or false: ");
            boolean optionB = getInputFromUser(scanner, "Enter true or false: ");

            String result = returnTrueOrFalse(optionA, optionB);
            System.out.println(result);
        }


    }
}







