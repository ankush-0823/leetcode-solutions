class Solution {
    public String frequencySort(String s) {
   int[] a=new int[123];
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
        a[(int)s.charAt(i)]++;
    }
    while(true){
       int max=0;
    for(int i=0;i<123;i++){
     if(a[i]>a[max]){
         max=i;
     }   
    }
    for(int i=1;i<=a[max];i++){
      sb.append((char)max);  
    }
        a[max]=0;
        if (sb.length()==s.length()){
                return sb.toString();
            }
    }
    }
}