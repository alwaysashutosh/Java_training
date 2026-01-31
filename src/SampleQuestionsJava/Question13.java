package SampleQuestionsJava;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Question13 {
    // Method to count frequency of each element
    public static Map<Integer, Integer> countFrequency(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();
        
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        return frequency;
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
        
        Map<Integer, Integer> frequency = countFrequency(arr);
        
        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
        
        scanner.close();
    }
}