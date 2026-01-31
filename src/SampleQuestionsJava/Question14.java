package SampleQuestionsJava;

public class Question14 {
    // Method to merge two sorted arrays
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        
        int i = 0, j = 0, k = 0;
        
        // Merge elements from both arrays in sorted order
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        
        // Copy remaining elements from arr1
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        
        // Copy remaining elements from arr2
        while (j < n2) {
            merged[k++] = arr2[j++];
        }
        
        return merged;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        int[] merged = mergeSortedArrays(arr1, arr2);
        
        System.out.print("Merged sorted array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}