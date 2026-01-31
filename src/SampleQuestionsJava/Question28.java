package SampleQuestionsJava;

import java.util.Scanner;

public class Question28 {
    public static String partitionAlphaNumeric(String str) {
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        
        // Return digits followed by letters
        return digits.toString() + letters.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter alphanumeric string: ");
        String str = scanner.nextLine();
        
        String result = partitionAlphaNumeric(str);
        System.out.println("Result is: " + result);
        
        scanner.close();
    }
}