package SampleQuestionsJava;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of lines: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.println("Enter " + n + " lines:");
        String[] lines = new String[n];
        
        for (int i = 0; i < n; i++) {
            lines[i] = scanner.nextLine();
        }
        
        // Process each line
        for (int i = 0; i < n; i++) {
            int posThe = lines[i].indexOf("the");
            int posOf = lines[i].indexOf("of");
            
            System.out.println("Line " + (i + 1) + ": Position of 'the' = " + 
                             (posThe == -1 ? -1 : posThe) + 
                             ", Position of 'of' = " + 
                             (posOf == -1 ? -1 : posOf));
        }
        
        scanner.close();
    }
}