class Solution {
    public int lengthOfLastWord(String s) {
        //int n =s.length;
        int l1=0;
        int i=s.length()-1;
         while( i>=0 && s.charAt(i)==' '){
             i--;
         }
         while(i>=0 && s.charAt(i)!=' '){
             l1++;
             i--;
         }
         return l1;
    }
}