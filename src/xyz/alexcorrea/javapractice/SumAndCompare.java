package xyz.alexcorrea.javapractice;

import java.util.Scanner;

public class SumAndCompare {

    public static int getInputFromUser(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while(!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Not a valid number, try again!");
        }
        return scanner.nextInt();
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int valueA = getInputFromUser(sc, "Enter the value for A: ");
            int valueB = getInputFromUser(sc, "Enter the value for B: ");
            int valueC = getInputFromUser(sc, "Enter the value for C: ");

            int sumResult = valueA + valueB;
            String separator = "---------------------------------";

            System.out.println(separator);
            System.out.printf("Values entered:%n" +
                            "A = %d%n" +
                            "B = %d%n" +
                            "C = %d%n", valueA, valueB, valueC);
            System.out.println(separator);

            if (sumResult > valueC) {
                System.out.printf("The sum of A and B (%d) is GREATER than C (%d)%n", sumResult, valueC);
            } else if(sumResult == valueC) {
                System.out.printf("The sum of A and B (%d) is EQUAL to C (%d)%n", sumResult, valueC);
            } else {
                System.out.printf("The sum of A and B (%d) is LESS than C (%d)%n", sumResult, valueC);
            }
        }
    }
}
