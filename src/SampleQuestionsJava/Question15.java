package SampleQuestionsJava;

import java.util.Scanner;

public class Question15 {
    // Method to find all pairs with given sum
    public static void findPairsWithSum(int[] arr, int targetSum) {
        System.out.print("Pairs with sum " + targetSum + ": ");
        boolean found = false;
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
                    found = true;
                }
            }
        }
        
        if (!found) {
            System.out.print("No pairs found");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter target sum: ");
        int targetSum = scanner.nextInt();
        
        findPairsWithSum(arr, targetSum);
        
        scanner.close();
    }
}