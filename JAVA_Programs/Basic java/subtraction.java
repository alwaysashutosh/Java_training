import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        int x, y, sub;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Type a number:");
        x = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj.nextInt(); // Read user input

        sub = x - y;  // Calculate the sum of x + y
        System.out.println("Subtraction is: " + sub); // Print the sum
        myObj.close(); // Close the Scanner object
    }
}
