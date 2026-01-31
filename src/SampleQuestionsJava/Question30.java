package SampleQuestionsJava;

public class Question30 {
    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    // Method to delete consecutive vowel pairs
    public static int deleteConsecutiveVowelPairs(String s) {
        StringBuilder result = new StringBuilder();
        int deletions = 0;
        int i = 0;
        
        while (i < s.length()) {
            if (i < s.length() - 1 && isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1))) {
                // Skip both vowels
                i += 2;
                deletions++;
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }
        
        System.out.println("Modified string: " + result.toString());
        return deletions;
    }
    
    public static void main(String[] args) {
        String s = "beautiful";
        int result = deleteConsecutiveVowelPairs(s);
        System.out.println("Number of deletions: " + result);
    }
}