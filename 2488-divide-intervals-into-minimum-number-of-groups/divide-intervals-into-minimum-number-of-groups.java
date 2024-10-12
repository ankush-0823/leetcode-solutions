class Solution {
    public int minGroups(int[][] intervals) {
        // List to store events (time, type), where type is +1 for start and -1 for end
        List<int[]> events = new ArrayList<>();
        
        // Convert intervals to events
        for (int[] interval : intervals) {
            events.add(new int[]{interval[0], 1}); // Start event
            events.add(new int[]{interval[1] + 1, -1}); // End event (non-overlapping)
        }
        
        // Sort events by time, and in case of a tie, sort by type (-1 should come before +1)
        Collections.sort(events, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        
        int currentGroups = 0;
        int maxGroups = 0;
        
        // Traverse through events and calculate the number of groups
        for (int[] event : events) {
            currentGroups += event[1]; // Add or subtract based on event type
            maxGroups = Math.max(maxGroups, currentGroups); // Update maxGroups
        }
        
        return maxGroups;
    }
}