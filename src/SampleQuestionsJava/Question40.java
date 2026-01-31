package SampleQuestionsJava;

public class Question40 {
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        
        // Handle edge cases
        if (n == 1) return arr[0];
        if (arr[0] >= arr[1]) return arr[0];
        if (arr[n-1] >= arr[n-2]) return arr[n-1];
        
        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                return arr[i];
            }
        }
        
        return -1; // Should not reach here for valid input
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        
        int peak = findPeakElement(arr);
        System.out.println("Peak element: " + peak);
    }
}