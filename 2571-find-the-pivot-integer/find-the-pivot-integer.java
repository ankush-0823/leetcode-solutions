class Solution {
    public int pivotInteger(int n) {
        int sum=0;
     
        for(int i=1;i<=n;i++){
         sum+=i;
     }
      int sum1=0;
     for(int i=1;i<=n;i++){
        sum1=sum1+i;
        if(sum1 == sum-sum1+i){
        return i;
     }
     }
     return -1;
    }
}