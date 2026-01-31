package SampleQuestionsJava;

import java.util.Scanner;

public class Question8 {
    // Method to count couples whose sum is divisible by N
    public static int countDivisibleCouples(int[] arr, int n) {
        int count = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] + arr[i + 1]) % n == 0) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter divisor: ");
        int n = scanner.nextInt();
        
        int result = countDivisibleCouples(arr, n);
        System.out.println(result);
        
        scanner.close();
    }
}