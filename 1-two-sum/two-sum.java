import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
    HashMap<Integer,Integer> h=new HashMap<>();
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<n;i++){
    if(h.containsKey(target-nums[i])){
       a.add(h.get(target-nums[i]));  
       a.add(i);
       break;
    }
   // break;
        else
        h.put(nums[i],i);
    }
    int[] result = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            result[i] = a.get(i);
        }
    return result;     
    }
}