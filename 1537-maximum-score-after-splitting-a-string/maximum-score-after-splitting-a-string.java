class Solution {
    public int maxScore(String s) {
    //   int n = s.length();
    // int sum = 0;
    // //char[] a = s.toCharArray();
    // int i = 0;

    // while (i < n - 1) {
    //     String s1 = s.substring(0, i + 1);
    //     String s2 = s.substring(i + 1, n);

    //     int c1 = 0;
    //     int c2 = 0;

    //     for (char ch : s1.toCharArray()) {
    //         if (ch == '0') c1++;
    //     }

    //     for (char ch : s2.toCharArray()) {
    //         if (ch == '1') c2++;
    //     }

    //     sum = Math.max(sum, c1 + c2);
    //     i++;
    // }

    // return sum;
   int  n=s.length();
   int sum=0;
     int i=0;
     while(i<n-1){
     //int j=i+1;
     String s1=s.substring(0,i+1);
     String s2=s.substring(i+1,n);
     int c1=0,c2=0;
   for(char ch: s1.toCharArray()){
     if(ch=='0') c1++;
   }
   for(char ch:s2.toCharArray()){
     if(ch=='1') c2++;
   }
    sum=Math.max(sum,c1+c2);
    i++;
     }
     return sum;
    }
}