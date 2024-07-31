class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int n=nums.length;
     
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n;j++){
             if(nums[j]==1) {
                c++;
             }
             else  break;
            }
            res= Math.max(c,res);
        }
        return res;
    }
}