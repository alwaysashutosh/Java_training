package SampleQuestionsJava;

import java.util.Scanner;

public class Question36 {
    public static int findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        
        return total - sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n (total numbers including the missing one): ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements (from 1 to " + n + ", with one missing):");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int missing = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missing);
        
        scanner.close();
    }
}