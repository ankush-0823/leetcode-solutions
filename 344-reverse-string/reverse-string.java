class Solution {
    public void reverseString(char[] s) {
      int l = s.length;
      int left=0;
      int right = l-1;
      while(left<right){
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
      }
     
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original array: " + new String(s));
        solution.reverseString(s);
        System.out.println("Reversed array: " + new String(s));
    }
}
