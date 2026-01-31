package SampleQuestionsJava;

import java.util.Arrays;

public class Question38 {
    public static void moveZerosToEnd(int[] arr) {
        int count = 0;
        
        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        
        // Fill remaining positions with zeros
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        moveZerosToEnd(arr);
        
        System.out.println("Array after moving zeros to end: " + Arrays.toString(arr));
    }
}