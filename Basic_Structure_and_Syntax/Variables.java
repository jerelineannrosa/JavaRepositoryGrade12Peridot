package Basic_Structure_and_Syntax;

public class Variables {
    public static void main(String[] args) {
        String name = "Jereline Ann L. Rosa";
        int age = 17; //declaring and initializing variables 
        final int score = 10;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        //score = 15; //This will cause an error because score is final and cannot be reassigned
        age = 18; 
        System.out.println("Updated Age: " + age);
        float height = 5.9f; //declaring and initializing float
        System.out.println("Height: " + height);
        char section = 'P';
        System.out.println("section: " + section);

    }
}
