class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        int n = details.length;
        for(int i=0;i<n;i++){
            String detail = details[i];
            int age = Integer.parseInt(detail.substring(11,13));
            if(age>60) c++;
        }
        return c;
    }
}