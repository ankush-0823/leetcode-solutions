class Solution {
    public long countSubstrings(String s, char c) {
        long count=0;
        long sub=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                sub+=1+count;
                count++;
            }
        }
        return sub;
    }
}