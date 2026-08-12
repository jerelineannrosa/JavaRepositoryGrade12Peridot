package Condition;

import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = input.nextInt();

        if (grade >= 75) {
            System.out.println("You Passed!");

            if (grade >= 90) {
                System.out.println("Excellent performance!");
            } else {
                System.out.println("Good job! Keep improving.");
            }

        } else {
            System.out.println("You Failed.");

            if (grade >= 70) {
                System.out.println("You almost passed.");
            } else {
                System.out.println("You need to study harder.");
            }
        }
        input.close();
    }
}