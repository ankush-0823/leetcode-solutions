class Solution {
    public int majorityElement(int[] nums) {
   
        int s = nums[0];
        int c = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == s) {
                c++;
            } else {
                c--;
                if (c == 0) {
                    s = nums[i];
                    c = 1;
                }
            }
        }

        return s;
    }
}
