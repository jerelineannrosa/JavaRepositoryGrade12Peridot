package Condition;

import java.util.Scanner;

public class nestedSwitchMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== FAST FOOD MENU =====");
        System.out.println("1. Burger");
        System.out.println("2. Fries");
        System.out.println("3. Drink");
        System.out.print("Choose a category (1-3): ");
        int category = input.nextInt();

        switch (category) {

            case 1:
                System.out.println("\n--- BURGER MENU ---");
                System.out.println("1. Cheeseburger");
                System.out.println("2. Chicken Burger");
                System.out.println("3. Bacon Burger");
                System.out.print("Choose your burger: ");
                int burger = input.nextInt();

                switch (burger) {
                    case 1:
                        System.out.println("You ordered a Cheeseburger - ₱99");
                        break;
                    case 2:
                        System.out.println("You ordered a Chicken Burger - ₱89");
                        break;
                    case 3:
                        System.out.println("You ordered a Bacon Burger - ₱119");
                        break;
                    default:
                        System.out.println("Invalid burger choice.");
                }
                break;

            case 2:
                System.out.println("\n--- FRIES MENU ---");
                System.out.println("1. Regular Fries");
                System.out.println("2. Cheese Fries");
                System.out.println("3. BBQ Fries");
                System.out.print("Choose your fries: ");
                int fries = input.nextInt();

                switch (fries) {
                    case 1:
                        System.out.println("You ordered Regular Fries - ₱50");
                        break;
                    case 2:
                        System.out.println("You ordered Cheese Fries - ₱70");
                        break;
                    case 3:
                        System.out.println("You ordered BBQ Fries - ₱65");
                        break;
                    default:
                        System.out.println("Invalid fries choice.");
                }
                break;

            case 3:
                System.out.println("\n--- DRINK MENU ---");
                System.out.println("1. Coke");
                System.out.println("2. Sprite");
                System.out.println("3. Iced Tea");
                System.out.print("Choose your drink: ");
                int drink = input.nextInt();

                switch (drink) {
                    case 1:
                        System.out.println("You ordered Coke - ₱40");
                        break;
                    case 2:
                        System.out.println("You ordered Sprite - ₱40");
                        break;
                    case 3:
                        System.out.println("You ordered Iced Tea - ₱45");
                        break;
                    default:
                        System.out.println("Invalid drink choice.");
                }
                break;

            default:
                System.out.println("Invalid category.");
        }

        input.close();
    }
}

