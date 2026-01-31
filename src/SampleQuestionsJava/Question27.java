package SampleQuestionsJava;

import java.util.Arrays;
import java.util.Scanner;

public class Question27 {
    public static String sortPipeSeparatedWords(String input) {
        // Split by pipe
        String[] words = input.split("\\|");
        
        // Sort the words
        Arrays.sort(words);
        
        // Join back with pipe
        return String.join("|", words);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter pipe-separated words: ");
        String input = scanner.nextLine();
        
        String result = sortPipeSeparatedWords(input);
        System.out.println("Sorted result: " + result);
        
        scanner.close();
    }
}