class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n =arr.length;
        int c=0;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
                if(target[i]!=arr[i])
               return false;   
        }
         return true;
    }
}