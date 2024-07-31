class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int n=nums.length;
     int c=0;
        for(int i=0;i<n;i++){
            
          if(nums[i]==0){
            c=0;
          }else c++;
            res= Math.max(c,res);
        }
        return res;
    }
}