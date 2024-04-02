class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths are different, strings can't be isomorphic
        }

        int[] sToT = new int[256]; // Mapping from characters in s to characters in t
        int[] tToS = new int[256]; // Mapping from characters in t to characters in s

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // If the mapping is not established yet, create a new mapping
            if (sToT[sChar] == 0 && tToS[tChar] == 0) {
                sToT[sChar] = tChar;
                tToS[tChar] = sChar;
            } else {
                // Check if the mappings match
                if (sToT[sChar] != tChar || tToS[tChar] != sChar) {
                    return false;
                }
            }
        }

        return true;
    }
}
