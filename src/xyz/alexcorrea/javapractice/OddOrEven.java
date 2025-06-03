package xyz.alexcorrea.javapractice;

import java.util.Scanner;

public class OddOrEven {


    public static int getInputFromUser(Scanner sc, String prompt) {
        System.out.println(prompt);
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.println("Not a valid number, try again!");
        }
        return sc.nextInt();
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int value = getInputFromUser(sc, "Enter a random value: ");

            System.out.printf("Value entered: %d%n", value);
            if(value % 2 == 0) {
                System.out.printf("%d is a even number!", value);
            } else {
                System.out.printf("%d is a odd number!", value);
            }
        }
    }


}
