class Solution {
    public int[] rearrangeArray(int[] nums) {
       int l= nums.length;
       int [] arr= new int[l];
       int pi=0;
       int ni=1;
      // HashMap<Integer,Integer>h= new HashMap<>();
      for(int i=0;i<l;i++){
          if(nums[i]>0){
              arr[pi]=nums[i];
              pi+=2;
          }else
          {
              arr[ni]=nums[i];
              ni+=2;
          }
      }
          return arr;
      
    }
}