package Condition;

import java.util.Scanner;

public class every_condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // IF
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // IF-ELSE
        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You cannot vote yet.");
        }

        System.out.print("Enter your score: ");
        int score = input.nextInt();

        // IF-ELSE IF-ELSE
        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        System.out.print("Enter a day number (1-3): ");
        int day = input.nextInt();

        // SWITCH
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day.");
        }

        input.close();
    }
}
