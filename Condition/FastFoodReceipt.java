package Condition;

import java.util.Scanner;

public class FastFoodReceipt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String meal = "", drink = "", dessert = "";
        double mealPrice = 0, drinkPrice = 0, dessertPrice = 0;

        boolean reorder;
        String ans;

        // ================= MEAL =================
        reorder = true;

        do {

            System.out.println("\n===== MEAL MENU =====");
            System.out.println("1. Chicken with Rice - ₱120");
            System.out.println("2. Burger with Fries - ₱150");
            System.out.println("3. Spaghetti with Garlic Bread - ₱130");
            System.out.println("0. No Meal");

            System.out.print("Choose your meal: ");
            int option = input.nextInt();

            switch(option) {

                case 1:
                    meal += "Chicken with Rice ";
                    mealPrice += 120;
                    break;

                case 2:
                    meal += "Burger with Fries ";
                    mealPrice += 150;
                    break;

                case 3:
                    meal += "Spaghetti with Garlic Bread ";
                    mealPrice += 130;
                    break;

                case 0:
                    meal = "No Meal";
                    mealPrice = 0;
                    reorder = false;
                    continue;

                default:
                    System.out.println("Invalid input.");
                    continue;
            }

            System.out.print("Do you want to order another meal?: ");
            ans = input.next();

            if(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {
                reorder = true;
            } else {
                reorder = false;
            }

        } while(reorder);



        // ================= DRINK =================
        reorder = true;

        do {

            System.out.println("\n===== DRINK MENU =====");
            System.out.println("1. Coke - ₱40");
            System.out.println("2. Sprite - ₱40");
            System.out.println("3. Iced Tea - ₱45");
            System.out.println("0. No Drink");

            System.out.print("Choose your drink: ");
            int option = input.nextInt();

            switch(option) {

                case 1:
                    drink += "Coke ";
                    drinkPrice += 40;
                    break;

                case 2:
                    drink += "Sprite ";
                    drinkPrice += 40;
                    break;

                case 3:
                    drink += "Iced Tea ";
                    drinkPrice += 45;
                    break;

                case 0:
                    drink = "No Drink";
                    drinkPrice = 0;
                    reorder = false;
                    continue;

                default:
                    System.out.println("Invalid input.");
                    continue;
            }

            System.out.print("Do you want to order another drink?: ");
            ans = input.next();

            if(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {
                reorder = true;
            } else {
                reorder = false;
            }

        } while(reorder);



        // ================= DESSERT =================
        reorder = true;

        do {

            System.out.println("\n===== DESSERT MENU =====");
            System.out.println("1. Ice Cream - ₱50");
            System.out.println("2. Sundae - ₱60");
            System.out.println("3. Apple Pie - ₱55");
            System.out.println("0. No Dessert");

            System.out.print("Choose your dessert: ");
            int option = input.nextInt();

            switch(option) {

                case 1:
                    dessert += "Ice Cream ";
                    dessertPrice += 50;
                    break;

                case 2:
                    dessert += "Sundae ";
                    dessertPrice += 60;
                    break;

                case 3:
                    dessert += "Apple Pie ";
                    dessertPrice += 55;
                    break;

                case 0:
                    dessert = "No Dessert";
                    dessertPrice = 0;
                    reorder = false;
                    continue;

                default:
                    System.out.println("Invalid input.");
                    continue;
            }

            System.out.print("Do you want to order another dessert?: ");
            ans = input.next();

            if(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {
                reorder = true;
            } else {
                reorder = false;
            }

        } while(reorder);



        // ================= PAYMENT =================

        double total = mealPrice + drinkPrice + dessertPrice;

        System.out.println("\n===== PAYMENT =====");
        System.out.println("Meal: " + meal);
        System.out.println("Drink: " + drink);
        System.out.println("Dessert: " + dessert);
        System.out.println("Total: ₱" + total);

        System.out.print("Enter Payment: ₱");
        double payment = input.nextDouble();

        if(payment >= total) {

            double change = payment - total;

            System.out.println("\n========== RECEIPT ==========");
            System.out.println("Meal: " + meal);
            System.out.println("Drink: " + drink);
            System.out.println("Dessert: " + dessert);
            System.out.println("-----------------------------");
            System.out.println("Total: ₱" + total);
            System.out.println("Payment: ₱" + payment);
            System.out.println("Change: ₱" + change);
            System.out.println("=============================");
            System.out.println("Thank you for ordering!");

        } else {

            System.out.println("\nInsufficient payment!");
            System.out.println("Need more: ₱" + (total - payment));

        }

        input.close();
    }
}