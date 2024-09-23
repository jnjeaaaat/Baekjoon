import java.util.*;

class Solution {
    
    List<Integer>[] graph;
    boolean[] visited;

    public int solution(int n, int[][] wires) {
        int min = Integer.MAX_VALUE;
        
        graph = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < wires.length; i++) {
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        
        for (int i = 0; i < wires.length; i++) {
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            
            graph[v1].remove(Integer.valueOf(v2));
            graph[v2].remove(Integer.valueOf(v1));
            
            visited = new boolean[n + 1];
            
            int count = bfs();
            min = Math.min(Math.abs(count - (n - count)), min);
            
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        
        return min;
    }
    
    private int bfs() {
        int count = 1;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            
            for (int v2 : graph[cur]) {
                if (!visited[v2]) {
                    count++;
                    queue.add(v2);
                    visited[v2] = true;
                }
            }
        }
        
        return count;
    }
}