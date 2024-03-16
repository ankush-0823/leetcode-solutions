class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i]=-1;
        }
        int sum=0;
        int max=0;
        mp.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(mp.containsKey(sum)){
                int last=mp.get(sum);
                max=Math.max(max,i-last);
            }else{
                mp.put(sum,i);
            }
        }
        return max;
    }
}