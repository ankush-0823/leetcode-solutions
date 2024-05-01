public class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder prefix = new StringBuilder();
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                prefix.append(word, 0, i + 1);
                break;  // Stop after finding the prefix
            }
        }
        
        if (prefix.length() == 0) {
            return word;  // Character not found, return original word
        }
        
        return prefix.reverse().toString() + word.substring(prefix.length());
    }
}
