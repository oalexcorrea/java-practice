package xyz.alexcorrea.javapractice;

import java.util.Scanner;

public class SalaryCalculator {

    public static double getInputFromUser(Scanner sc, String prompt) {
        System.out.println(prompt);
        while(!sc.hasNextDouble()) {
            sc.nextInt();
            System.out.println("Not a valid number, try again!");
        }
        return sc.nextDouble();
    }


    // Calculate how many mininum salarys you make (In Brazil there is a mininum wage)
    // I used the word salary because I live in a brazilian context

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double salary = getInputFromUser(sc, "Enter your salary here: ");
            double mininumSalary = salary / 1518;
            System.out.printf("You make: %f" + " mininum salarys", mininumSalary);
        }


    }
}
