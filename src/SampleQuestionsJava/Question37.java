package SampleQuestionsJava;

import java.util.ArrayList;
import java.util.List;

public class Question37 {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersection.add(arr1[i]);
                    break;
                }
            }
        }
        
        return intersection;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        
        List<Integer> result = findIntersection(arr1, arr2);
        
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}