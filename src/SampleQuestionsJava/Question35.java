package SampleQuestionsJava;

import java.util.Scanner;

public class Question35 {
    // Method to left rotate array by d positions
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d > n
        
        // Store first d elements
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        
        // Shift elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        
        // Place the stored elements at the end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
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
        
        System.out.print("Enter rotation positions: ");
        int d = scanner.nextInt();
        
        leftRotate(arr, d);
        
        System.out.print("Rotated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}