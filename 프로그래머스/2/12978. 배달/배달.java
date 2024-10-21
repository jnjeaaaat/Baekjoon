import java.util.*;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        
        int[][] graph = new int[N + 1][N + 1];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                
                if (i == j) {
                    continue;
                }
                
                graph[i][j] = 500_000;
            }
        }
        
        for (int i = 0; i < road.length; i++) {
            int a = road[i][0];
            int b = road[i][1];
            int cost = road[i][2];
            
            graph[a][b] = Math.min(graph[a][b], cost);
            graph[b][a] = Math.min(graph[b][a], cost);
        }
        
        for (int v = 1; v < N + 1; v++) {
            
            for (int i = 1; i < N + 1; i++) {
                for (int j = 1; j < N + 1; j++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][v] + graph[v][j]);
                }
            }
            
        }
        
        for (int j = 1; j < N + 1; j++) {
            if (graph[1][j] <= K) {
                answer++;
            }
        }
        
        return answer;
    }
}
