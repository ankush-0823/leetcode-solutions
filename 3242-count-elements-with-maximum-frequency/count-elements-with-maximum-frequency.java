import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101]; // Assuming the range of elements is from 0 to 100
        int max = 0;

        // Count the frequency of each element in nums and track the maximum frequency
        for (int num : nums) {
            arr[num]++;
            max = Math.max(max, arr[num]);
        }

        int total = 0;

        // Calculate the total sum of numbers with the maximum frequency
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
              total =total+max;
            }
        }

        return total;
    }
}

      
       