import java.util.Scanner;  
public class multiply {
    public static void main(String[] args) {
        int x, y, mul;
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Type a number:");
        x = myObj.nextInt(); 

        System.out.println("Type another number:");
        y = myObj.nextInt(); 

        mul = x * y; 
        System.out.println("Multiplication is: " + mul); // Print the sum
        myObj.close(); 
    }
}
