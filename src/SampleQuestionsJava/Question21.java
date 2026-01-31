package SampleQuestionsJava;

import java.util.Scanner;

public class Question21 {
    // Method to check if a substring is a palindrome
    public static boolean isPalindrome(String str, int start, int length) {
        int end = start + length - 1;
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(start + i) != str.charAt(end - i)) {
                return false;
            }
        }
        return true;
    }
    
    // Method to calculate score based on palindromes
    public static int calculateScore(String str) {
        int score = 0;
        int len = str.length();
        
        // Check for palindromes of length 4
        for (int i = 0; i <= len - 4; i++) {
            if (isPalindrome(str, i, 4)) {
                score += 5;
            }
        }
        
        // Check for palindromes of length 5
        for (int i = 0; i <= len - 5; i++) {
            if (isPalindrome(str, i, 5)) {
                score += 10;
            }
        }
        
        return score;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        
        int score = calculateScore(str);
        System.out.println("Score: " + score);
        
        scanner.close();
    }
}