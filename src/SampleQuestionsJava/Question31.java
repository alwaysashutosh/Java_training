package SampleQuestionsJava;

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first list of integers (comma-separated): ");
        String input1 = scanner.nextLine();
        String[] list1 = input1.split(",");
        
        System.out.print("Enter the second list of integers (comma-separated): ");
        String input2 = scanner.nextLine();
        String[] list2 = input2.split(",");
        
        // Process each number in list1
        for (String numStr : list1) {
            int N = Integer.parseInt(numStr.trim());
            int sum = 0;
            
            // Calculate sum of occurrences in list2
            for (String num2Str : list2) {
                int num2 = Integer.parseInt(num2Str.trim());
                if (num2 == N) {
                    sum += num2;
                }
            }
            
            System.out.println(N + "-" + sum);
        }
        
        scanner.close();
    }
}