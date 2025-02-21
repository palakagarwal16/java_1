import java.util.Scanner;

public class ty { // Class name should match the file name

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input

        // Read an integer input
        System.out.print("Enter your age: ");
        int age = input.nextInt(); // Read an integer from the user

        // Print confirmation messages
        System.out.println("Data entered");
        System.out.println("Your age: " + age);
        
        input.close(); // Close the Scanner object
    }
}

    
