import java.util.*;

public class Solution {
    
    private boolean check(Map<Integer, List<Integer>> mp, int node, int dest, boolean[] visited) {
        if (node == dest)
            return true;

        if (visited[node])
            return false;

        visited[node] = true;
        for (int it : mp.getOrDefault(node, new ArrayList<>())) {
            if (check(mp, it, dest, visited))
                return true;
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if (source == destination)
            return true;

        Map<Integer, List<Integer>> mp = new HashMap<>();

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            mp.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            mp.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        boolean[] visited = new boolean[n];
        return check(mp, source, destination, visited);
    }
}
