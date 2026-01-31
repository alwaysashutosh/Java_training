package SampleQuestionsJava;

import java.util.Scanner;

public class Question1 {
    // Method to insert a character at specified position
    public static String insertAt(String str, int pos, char ch) {
        if (pos < 0 || pos > str.length()) {
            throw new IllegalArgumentException("Invalid position");
        }
        
        StringBuilder sb = new StringBuilder(str);
        sb.insert(pos, ch);
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter position to insert: ");
        int pos = scanner.nextInt();
        
        System.out.print("Enter character: ");
        char ch = scanner.next().charAt(0);
        
        String result = insertAt(str, pos, ch);
        System.out.println("Final string is: " + result);
        
        scanner.close();
    }
}