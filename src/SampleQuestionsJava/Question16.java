package SampleQuestionsJava;

import java.util.Arrays;
import java.util.Scanner;

public class Question16 {
    // Method to sort characters in a string
    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
    // Method to check if all words are anagrams
    public static boolean areAllAnagrams(String[] words) {
        if (words.length == 0) return true;
        
        String firstSorted = sortString(words[0].toLowerCase());
        
        for (int i = 1; i < words.length; i++) {
            String currentSorted = sortString(words[i].toLowerCase());
            if (!firstSorted.equals(currentSorted)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter comma-separated words: ");
        String input = scanner.nextLine();
        
        String[] words = input.split(",");
        // Trim whitespace from each word
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].trim();
        }
        
        boolean result = areAllAnagrams(words);
        System.out.println(result);
        
        scanner.close();
    }
}