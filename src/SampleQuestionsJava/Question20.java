package SampleQuestionsJava;

import java.util.Scanner;

public class Question20 {
    // Method to reverse pipe-separated words
    public static String reversePipeSeparatedWords(String input) {
        String[] words = input.split("\\|");
        StringBuilder result = new StringBuilder();
        
        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append("|");
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter pipe-separated words: ");
        String input = scanner.nextLine();
        
        String result = reversePipeSeparatedWords(input);
        System.out.println("Reversed order: " + result);
        
        scanner.close();
    }
}