package SampleQuestionsJava;

public class Question22 {
    // Method to insert substring at specified position
    public static String insertSubstring(String original, String toInsert, int position) {
        if (position < 0 || position > original.length()) {
            throw new IllegalArgumentException("Invalid position");
        }
        
        StringBuilder sb = new StringBuilder();
        // Append part before insertion point
        sb.append(original.substring(0, position));
        // Append the new substring
        sb.append(toInsert);
        // Append the remaining part of original string
        sb.append(original.substring(position));
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String str = "C programming";
        String insert = "ABC";
        int pos = 3;
        
        String result = insertSubstring(str, insert, pos);
        System.out.println("Modified string: " + result);
    }
}