import java.util.*;

class Solution {
    
    static int[] count;
    static List<List<Integer>> list;
    
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        int[] answer = new int[sources.length];
        
        list = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        
        for (int[] road : roads) {
            list.get(road[0]).add(road[1]);
            list.get(road[1]).add(road[0]);
        }
        
        count = new int[n + 1];
        Arrays.fill(count, -1);
        bfs(destination);
        
        for (int i = 0; i < sources.length; i++) {
            answer[i] = count[sources[i]];
        }
        
        return answer;
    }
    
    private void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        count[start] = 0;
        
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            
            for (int next : list.get(cur)) {
                if (count[next] == -1) {
                    count[next] = count[cur] + 1;
                    queue.add(next);
                }
            }
        }
    }
}