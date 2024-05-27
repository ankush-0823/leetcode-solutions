import java.util.Arrays;

public class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums); // Sort the array
        int n = nums.length; // Get the length of the array
        int prev = -1; // Initialize previous number tracker

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            // Check if the current count (n - i) satisfies the condition
            if (prev < n - i && n - i <= num) {
                return n - i;
            }
            prev = num; // Update the previous number tracker
        }

        return -1; // If no such number exists, return -1
    }
}