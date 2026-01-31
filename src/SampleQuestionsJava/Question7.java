package SampleQuestionsJava;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question7 {
    // Method to remove duplicate elements from array
    public static List<Integer> removeDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        isDuplicate = true;
                    }
                }
                if (!isDuplicate) {
                    result.add(arr[i]);
                }
            }
        }
        
        return result;
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
        
        List<Integer> result = removeDuplicates(arr);
        System.out.print("Non-duplicate elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}