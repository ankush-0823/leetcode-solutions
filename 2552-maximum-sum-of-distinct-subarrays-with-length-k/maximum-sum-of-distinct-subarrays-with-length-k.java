class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans =0;
        long currsum =0;
        int n = nums.length;
// using HashMap to check the count
        Map<Integer,Integer> map = new HashMap<>();
//         pahli baar hit hoga condition toh
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            currsum += (long)nums[i];
        }
    
    
        if(map.size()==k){
        ans = currsum;
    }
    
    
//     after moving sliding window
    
    int l=0;
    for(int i=k;i<n;i++){
        currsum -=(long)nums[l];
        currsum +=(long)nums[i];
        
        map.put(nums[l],map.get(nums[l])-1);
        if(map.get(nums[l])==0){
            map.remove(nums[l]);
        }
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        l++;
        if(map.size()==k){
            ans = Math.max(currsum,ans);
        }
       
    }
         return ans;
        
    }
}