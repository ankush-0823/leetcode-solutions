class Solution {
    public int maxSubarray(int[] nums, int n) {
        int res = nums[0];
        int maxEnd = nums[0];
        for (int i = 1; i < n; i++) {
            maxEnd = Math.max(maxEnd + nums[i], nums[i]);
            res = Math.max(maxEnd, res);
        }
        return res;
    }

    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int maxNorm = maxSubarray(nums, n);
        if (maxNorm < 0) return maxNorm;

        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += nums[i];
            nums[i] = -nums[i];
        }
        
        int maxCircular = curr_sum + maxSubarray(nums, n);
        return Math.max(maxCircular, maxNorm);
    }
}
