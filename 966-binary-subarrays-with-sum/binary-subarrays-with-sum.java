class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
     int l =nums.length;
     int count =0;
     int sum=0;
     for(int i=0;i<l;i++){
        for(int j=i;j<l;j++){
            sum +=nums[j];
            if(sum == goal){
                count++;
            }
        }
        sum=0;
        
     }
     return count;
    }
}