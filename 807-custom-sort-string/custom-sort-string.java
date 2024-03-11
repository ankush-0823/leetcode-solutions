public class Solution {
    public String customSortString(String order, String str) {
        int[] count = new int[26];

        for (char x : str.toCharArray())
            count[x - 'a']++;

        StringBuilder result = new StringBuilder();
        for (char ch : order.toCharArray()) {
            while (count[ch - 'a']-- > 0) {
                result.append(ch);
            }
        }

        // Add the characters which are not present in 'order'
        for (char ch : str.toCharArray()) {
            if (count[ch - 'a'] > 0) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}