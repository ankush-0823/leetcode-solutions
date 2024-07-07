public class Solution {
    public boolean isMatch(String s, String p) {
        // Base case: if the pattern is empty, the string must also be empty for a match
        if (p.isEmpty()) return s.isEmpty();

        // Check if the first character of the string matches the first character of the pattern,
        // or if the first character of the pattern is a dot (which can match any character)
        boolean firstMatch = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

        // If the pattern length is at least 2 and the second character is an asterisk
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // Check two cases:
            // 1. The asterisk represents zero occurrences of the preceding element
            // 2. The asterisk represents one or more occurrences of the preceding element
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            // If the second character is not an asterisk, check if the first characters match and continue
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

    public static void main(String[] args) {
        Solution matcher = new Solution();
        System.out.println(matcher.isMatch("aa", "a")); // false
        System.out.println(matcher.isMatch("aa", "a*")); // true
        System.out.println(matcher.isMatch("ab", ".*")); // true
        System.out.println(matcher.isMatch("aab", "c*a*b")); // true
        System.out.println(matcher.isMatch("mississippi", "mis*is*p*")); // false
    }
}