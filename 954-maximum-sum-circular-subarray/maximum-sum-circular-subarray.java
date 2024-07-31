class Solution {
     public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int normalsum = maxNormal(nums,n);
        if(normalsum<0) return normalsum;
         int arrsum=0;
       for(int i=0;i<n;i++){
         arrsum+= nums[i];
        nums[i]= -nums[i];
       }
       int maxcircularsum = arrsum + maxNormal(nums,n);
       int res = Math.max(maxcircularsum , normalsum);
       return res;
        
    }
    public int maxNormal(int arr[] , int n){
        int res= arr[0];
        int currsum= arr[0];

        for(int i=1;i<n;i++){
            currsum= Math.max(currsum+arr[i], arr[i]);
            res = Math.max(res , currsum);
        }
        return res;
    }
}
