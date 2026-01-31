package SampleQuestionsJava;

import java.util.Scanner;

public class Question6 {
    // Method to find closest perfect square
    public static int closestPerfectSquare(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Enter a positive integer");
        }
        
        int lowerRoot = (int) Math.sqrt(number);
        int upperRoot = lowerRoot + 1;
        int lowerSquare = lowerRoot * lowerRoot;
        int upperSquare = upperRoot * upperRoot;
        
        if ((number - lowerSquare) <= (upperSquare - number)) {
            return lowerSquare;
        } else {
            return upperSquare;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();
        
        try {
            int result = closestPerfectSquare(number);
            System.out.println("Closest integer: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}