package SampleQuestionsJava;

public class Question18 {
    // Method to remove last occurrence of a word from string
    public static String removeLastOccurrence(String str, String word) {
        int lastIndex = str.lastIndexOf(word);
        
        if (lastIndex == -1) {
            System.out.println("Word not found.");
            return str;
        }
        
        // Remove the last occurrence
        return str.substring(0, lastIndex) + str.substring(lastIndex + word.length());
    }
    
    public static void main(String[] args) {
        String str = "I am a programmer. I learn at Codeforwin.";
        String word = "I";
        
        String result = removeLastOccurrence(str, word);
        System.out.println("String after removing last occurrence of '" + word + "':");
        System.out.println(result);
    }
}