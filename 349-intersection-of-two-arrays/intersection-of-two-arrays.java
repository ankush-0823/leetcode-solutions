import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<l;i++){
            h.add(nums1[i]);
        }
        for(int j=0;j<m;j++){
            if(h.contains(nums2[j])){
                a.add(nums2[j]);
                h.remove(nums2[j]);
            }
        }
        int[] result = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            result[i] = a.get(i);
        }
        
        return result;
    }
}
