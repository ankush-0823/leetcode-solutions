import java.util.HashMap;

public class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int c = 0;
        int sum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int remainder = (sum % k + k) % k;
            
            if (map.containsKey(remainder)) {
                c += map.get(remainder);
            }
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        
        return c;
    }
}