package SampleQuestionsJava;

import java.util.Scanner;

public class Question2 {
    // Method to delete alternating characters (keep even indices: 0, 2, 4, ...)
    public static String deleteAlternating(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        
        String result = deleteAlternating(str);
        System.out.println("String is: " + result);
        
        scanner.close();
    }
}