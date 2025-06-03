package xyz.alexcorrea.javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DescendingOrder {

    public static List<Integer> getNumbersFromUser(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Please enter three numbers.");

        for (int i = 1; i <= 3; i++) {
            int number;
            while (true) {
                System.out.println("Enter number " + i + ": ");
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    numbers.add(number);
                    scanner.nextLine();
                    break;
                } else {
                    // input invalido, consome o input e roda dnv essa porra
                    String invalidInput = scanner.next(); // consome o input
                    System.out.println("'" + invalidInput + "' is not a valid number. Please try again!");
                    scanner.nextLine();
                }
            }
        }
        return numbers;
    }

    public static List<Integer> sortDescending(List<Integer> numbers) {
        numbers.sort(Collections.reverseOrder());
        return numbers;
    }

    public static void printNumbers(List<Integer> numbers, String message) {
        if (numbers.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println(message);
        for (double number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> userNumbers = getNumbersFromUser(scanner);
            List<Integer> sortedNumbers = sortDescending(userNumbers);
            printNumbers(sortedNumbers, "\nNumbers sorted in descending order:");


        }
    }
}
