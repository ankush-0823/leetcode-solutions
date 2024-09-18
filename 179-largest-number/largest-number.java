class Solution {
    public String largestNumber(int[] nums) {
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String a,String b){
                String o1=a+b;
                String o2=b+a;
                return o2.compareTo(o1);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
        if(sb.charAt(0)=='0'){
        return "0";
        }
        return sb.toString();

}
}