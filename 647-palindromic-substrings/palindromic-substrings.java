class Solution {
    private int count = 0;

    private void check(String s, int i, int j, int n) {
        while (i >= 0 && j < n && s.charAt(i) == s.charAt(j)) {
            count++;
            i--; // expanding from center
            j++; // expanding from center
        }
    }

    public int countSubstrings(String s) {
        int n = s.length();
        count = 0;

        /*
         * Every single character in the string is a center for possible odd-length
         * palindromes: check(s, i, i); Every pair of consecutive characters in the
         * string is a center for possible even-length palindromes: check(s, i, i+1);
         */
        for (int i = 0; i < n; i++) {
            check(s, i, i, n);
            check(s, i, i + 1, n);
        }
        return count;
    }
}