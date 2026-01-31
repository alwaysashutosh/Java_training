package SampleQuestionsJava;

import java.util.Scanner;

public class Question26 {
    public static int countValidElements(int[] arr) {
        int count = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i] && arr[j] % arr[i] == 0) {
                    count++;
                }
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
        
        int result = countValidElements(arr);
        System.out.println("Total count of valid next elements: " + result);
        
        scanner.close();
    }
}