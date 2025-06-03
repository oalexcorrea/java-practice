package xyz.alexcorrea.javapractice;

import java.util.Scanner;

public class AddFivePercent {
    public static double getInputFromUser(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while(!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Not a valid number, try again!");
        }
        return scanner.nextDouble();
    }

    public static double calculateFivePercentAdjustment(double salary) {
        return salary - (salary * 0.05);

    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            double salary = getInputFromUser(scanner, "Enter your salary here: ");
            double adjustedSalary = calculateFivePercentAdjustment(salary);
            System.out.printf("Your salary is: $%.2f%n", salary);
            System.out.printf("With the 5 percent adjustment, your salary now is: $%.2f%n", adjustedSalary);

        }
    }
}
