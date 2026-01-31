package SampleQuestionsJava;

import java.util.Scanner;

public class Question19 {
    // Method to replace first occurrence of a character
    public static String replaceFirstOccurrence(String str, char oldChar, char newChar) {
        int index = str.indexOf(oldChar);
        if (index == -1) {
            return str; // Character not found
        }
        
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index, newChar);
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the input string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter character to replace: ");
        char ch1 = scanner.nextLine().charAt(0);
        
        System.out.print("Enter character to replace with: ");
        char ch2 = scanner.nextLine().charAt(0);
        
        String result = replaceFirstOccurrence(str, ch1, ch2);
        System.out.println("String after replacing '" + ch1 + "' with '" + ch2 + "': " + result);
        
        scanner.close();
    }
}