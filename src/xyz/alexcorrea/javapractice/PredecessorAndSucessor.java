package xyz.alexcorrea.javapractice;

import java.util.Scanner;

public class PredecessorAndSucessor {
    public static int getInputFromUser(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while(!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Not a valid number, try again!");
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int value = getInputFromUser(sc, "Enter a value: ");
            int predecessor = value-1;
            int sucessor = value+1;
            System.out.printf("Value entered: %d%n", value);
            System.out.printf("%d is the predecessor of %d%n", predecessor, value);
            System.out.printf("%d is the sucessor of %d%n", sucessor, value);

        }
    }
}
