package SampleQuestionsJava;

import java.util.Scanner;

public class Question24 {
    // Method to remove substring and insert new one at same position
    public static String replaceSubstring(String original, String toRemove, String toInsert) {
        int index = original.indexOf(toRemove);
        
        if (index == -1) {
            System.out.println("Substring to remove not found.");
            return original;
        }
        
        StringBuilder sb = new StringBuilder();
        // Append part before the substring
        sb.append(original.substring(0, index));
        // Append the new substring
        sb.append(toInsert);
        // Append part after the removed substring
        sb.append(original.substring(index + toRemove.length()));
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the original string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter the substring to remove: ");
        String toRemove = scanner.nextLine();
        
        System.out.print("Enter the substring to insert: ");
        String toInsert = scanner.nextLine();
        
        String result = replaceSubstring(str, toRemove, toInsert);
        System.out.println("Modified string: " + result);
        
        scanner.close();
    }
}