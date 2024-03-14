class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        
        // HashMap to store cumulative sums and their frequencies
        HashMap<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        int currSum = 0;
        mp.put(0, 1);
        for (int num : nums) {
            currSum += num;

            // If there is a previous sum such that (current sum - previous sum) equals goal, increment count by the frequency of that previous sum
            if (mp.containsKey(currSum - goal)) {
                count += mp.get(currSum - goal);
            }
            
            // Increment the frequency of current sum in the map
            mp.put(currSum, mp.getOrDefault(currSum, 0) + 1);
        }
        
        return count;
    }
}