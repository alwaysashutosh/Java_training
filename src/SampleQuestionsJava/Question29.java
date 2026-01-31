package SampleQuestionsJava;

import java.util.Scanner;

public class Question29 {
    // Method to check if a substring is a palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    // Method to find the length of the longest palindromic substring
    public static int longestPalindromeLength(String str) {
        int maxLength = 1;
        int len = str.length();
        
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (isPalindrome(str, i, j)) {
                    int currentLength = j - i + 1;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                    }
                }
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        
        int result = longestPalindromeLength(str);
        System.out.println("Length of the longest palindromic substring: " + result);
        
        scanner.close();
    }
}