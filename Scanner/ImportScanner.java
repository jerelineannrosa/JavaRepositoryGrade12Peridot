package Scanner;

import java.util.Scanner;

public class ImportScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = sc.nextLine();

        System.out.println("What's your age? ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("What is your favorite color? ");
        String color = sc.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + color + ".");

    }
}
