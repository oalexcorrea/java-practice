package xyz.alexcorrea.javapractice;

import java.util.Scanner;

public class SumOrMultiply {
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
            int valueA = getInputFromUser(sc, "Enter the value of A: ");
            int valueB = getInputFromUser(sc, "Enter the value of B: ");
            String separator = "-----------------";

            System.out.println(separator);
            System.out.println("Values entered: ");
            System.out.printf("Value A: %d%n", valueA);
            System.out.printf("Value B: %d%n", valueB);
            System.out.println(separator);

            if(valueA == valueB) {
                int result = valueA + valueB;
                System.out.printf("Both numbers are equal! The result of the sum is = %d",result);
            } else {
                int result = valueA * valueB;
                System.out.printf("Numbers do not coincide! The result of the multiplication is = %d",result);
            }
        }
    }

}
