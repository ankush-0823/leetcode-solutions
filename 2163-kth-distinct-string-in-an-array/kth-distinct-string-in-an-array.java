class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freqMap = new HashMap<>();

        // Count the frequency of each string in the array
        for (String s : arr) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }

        // Iterate through the array and find the k-th distinct string
        int count = 0;
        for (String s : arr) {
            if (freqMap.get(s) == 1) {  // Check if the string is distinct
                count++;
                if (count == k) {
                    return s;
                }
            }
        }

        return "";  
    }
    }