class Solution {
    public int[] singleNumber(int[] nums) {
        int l=nums.length;
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<l;i++){
            if(h.containsKey(nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }else h.put(nums[i],1);
        }
        ArrayList<Integer>a=new ArrayList<>();
         for (int key : h.keySet()) {
        if(h.get(key)==1)
       a.add(key);
      }
     int []result=new int[a.size()];
     for(int i=0;i<a.size();i++){
        result[i]=a.get(i);
     }
   return result;
    }
}