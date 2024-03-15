class Solution {
    public int[] productExceptSelf(int[] nums) {
     int n=nums.length;
     int[]op=new int[n];
     Arrays.fill(op,1);
     int curr=1;
     for(int i=0;i<n;i++){
        op[i]*=curr;
        curr*=nums[i];
     }  
     curr=1;
     for(int i=n-1;i>=0;i--){
       op[i]=(op[i]*curr); 
        curr*=nums[i]; 
     } 
   
     return op;
    }
}