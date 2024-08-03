class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i=0,j=0;
        while(i<m&&j<n){
        if(t.charAt(i)==s.charAt(j)) {
            i++;
            j++;
        }
        else i++;
        }
        return j==n;
       
    }
}