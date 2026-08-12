package Scanner;

import java.util.Scanner;
public class JavaScanner {
    
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter your name: ");
       String name = scanner.nextLine();

       System.out.println("Enter your age: ");
       int age = scanner.nextInt();

       System.out.println("What is your gwa: ");
       double gwa = scanner.nextDouble();

       System.out.println("Are you a student? (yes/no): ");
       String isStudentResponse = scanner.next();
       boolean isStudent = isStudentResponse.equalsIgnoreCase("yes");

       System.out.println("Hello " + name);
       System.out.println("You are " + age + " years old");
       System.out.println("Your gwa is: " + gwa);

       if(isStudent){
           System.out.println("You are enrolled in classes");
       }
       else{
           System.out.println("You are NOT enrolled in classes");
      }

       scanner.close();
   }
  }

