package SampleQuestionsJava;

import java.util.Scanner;

public class Question4 {
    // Method to find maximum deletions of consecutive character pairs
    public static int maxDeletions(String str) {
        StringBuilder stack = new StringBuilder();
        int deletions = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == current) {
                stack.deleteCharAt(stack.length() - 1);
                deletions++;
            } else {
                stack.append(current);
            }
        }
        
        return deletions;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        
        int result = maxDeletions(str);
        System.out.println("Maximum deletions: " + result);
        
        scanner.close();
    }
}