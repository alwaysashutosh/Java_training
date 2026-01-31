package SampleQuestionsJava;

import java.util.Scanner;

public class Question3 {
    // Method to remove consecutive duplicate characters iteratively
    public static String removeConsecutiveDuplicates(String str) {
        boolean changed;
        StringBuilder sb = new StringBuilder(str);
        
        do {
            changed = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    char dup = sb.charAt(i);
                    int start = i;
                    // Find all consecutive duplicates
                    while (i < sb.length() && sb.charAt(i) == dup) {
                        i++;
                    }
                    // Remove the duplicates
                    sb.delete(start, i);
                    changed = true;
                    i = start - 1; // Adjust index after deletion
                }
            }
        } while (changed);
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        
        String result = removeConsecutiveDuplicates(str);
        System.out.println("Final string: " + result);
        
        scanner.close();
    }
}