package SampleQuestionsJava;

import java.util.Scanner;

public class Question34 {
    public static int countNotDivisible(int[] arr) {
        int count = 0;
        int size = arr.length;
        
        for (int i = 0; i < size; i++) {
            boolean divisible = false;
            for (int j = 0; j < size; j++) {
                if (i != j && arr[i] % arr[j] == 0) {
                    divisible = true;
                    break;
                }
            }
            if (!divisible) {
                count++;
            }
        }
        
        return count;
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
        
        int result = countNotDivisible(arr);
        System.out.println("Result is: " + result);
        
        scanner.close();
    }
}