package SampleQuestionsJava;

import java.util.Scanner;

public class Question5 {
    // Method to calculate sum of digits
    public static int sumOfDigits(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Enter a positive number");
        }
        
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();
        
        try {
            int result = sumOfDigits(number);
            System.out.println("Sum of digits: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}