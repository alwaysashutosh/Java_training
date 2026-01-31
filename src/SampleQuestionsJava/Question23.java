package SampleQuestionsJava;

public class Question23 {
    // Method to insert substring at specified position
    public static String insertSubstring(String original, String toInsert, int position) {
        if (position < 0 || position > original.length()) {
            throw new IllegalArgumentException("Invalid position");
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(original.substring(0, position));
        sb.append(toInsert);
        sb.append(original.substring(position));
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String str = "ABCDEF";
        
        // Insert "Hello" at position 0
        str = insertSubstring(str, "Hello", 0);
        
        // Insert "World" at position 5
        str = insertSubstring(str, "World", 5);
        
        // Insert "!" at the end
        str = insertSubstring(str, "!", str.length());
        
        System.out.println("Modified string: " + str);
    }
}