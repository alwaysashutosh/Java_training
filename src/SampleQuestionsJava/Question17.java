package SampleQuestionsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question17 {
    // Method to sort characters in a string
    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    
    // Method to check if two strings are anagrams
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        return sortString(a.toLowerCase()).equals(sortString(b.toLowerCase()));
    }
    
    // Method to find unique words (not anagrams or identical to any other)
    public static List<String> findUniqueWords(String[] words) {
        List<String> uniqueWords = new ArrayList<>();
        boolean[] isUnique = new boolean[words.length];
        
        // Initialize all as unique
        Arrays.fill(isUnique, true);
        
        // Check for anagrams and duplicates
        for (int i = 0; i < words.length; i++) {
            if (!isUnique[i]) continue;
            
            for (int j = i + 1; j < words.length; j++) {
                if (isAnagram(words[i], words[j])) {
                    isUnique[i] = false;
                    isUnique[j] = false;
                }
            }
        }
        
        // Collect unique words
        for (int i = 0; i < words.length; i++) {
            if (isUnique[i]) {
                uniqueWords.add(words[i]);
            }
        }
        
        return uniqueWords;
    }
    
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "hello", "world", "abc", "cba"};
        
        List<String> result = findUniqueWords(words);
        
        System.out.println("Unique words (not anagrams or identical):");
        for (String word : result) {
            System.out.println(word);
        }
    }
}