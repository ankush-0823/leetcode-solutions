import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int p) {
        int n = tasks.length;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : tasks) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        // We want to finish the process which is most occurring (having the highest frequency)
        // so that we don't have to finish it last with p gaps.
        for (int count : map.values()) {
            pq.offer(count);
        }
        
        int cycles = 0;
        while (!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i <= p; i++) {
                if (!pq.isEmpty()) {
                    temp.add(pq.poll() - 1); // Finishing one instance of each process
                }
            }
            
            for (int freq : temp) {
                if (freq > 0) {
                    pq.offer(freq);
                }
            }
            
            cycles += pq.isEmpty() ? temp.size() : p + 1;
        }
        
        return cycles;
    }
}
