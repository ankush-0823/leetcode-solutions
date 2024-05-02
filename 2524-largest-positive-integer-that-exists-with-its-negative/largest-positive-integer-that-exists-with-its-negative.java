class Solution {
    public int findMaxK(int[] nums) {
        int max=0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(nums);
    int i=0;
    int j=nums.length-1;
    while(j>=i){
        if(-nums[i]==nums[j]) return nums[j];
        if(-nums[i]<nums[j]){
            j--;
        }else i++;
    }
    return -1;
    }

}