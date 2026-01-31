package SampleQuestionsJava;

import java.util.Scanner;

public class Question33 {
    public static int calculateScore(int[] arr) {
        int score = 0;
        int size = arr.length;
        
        // Check couples (sum is even)
        for (int i = 0; i < size - 1; i++) {
            if ((arr[i] + arr[i + 1]) % 2 == 0) {
                score += 5;
            }
        }
        
        // Check triplets (sum is odd AND product is even)
        for (int i = 0; i < size - 2; i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];
            int product = arr[i] * arr[i + 1] * arr[i + 2];
            
            if (sum % 2 != 0 && product % 2 == 0) {
                score += 10;
            }
        }
        
        return score;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int result = calculateScore(arr);
        System.out.println("Score is: " + result);
        
        scanner.close();
    }
}