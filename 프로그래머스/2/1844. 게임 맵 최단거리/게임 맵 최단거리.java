import java.util.*;

class Solution {
    
    int[][] count;
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    public int solution(int[][] maps) {
        int answer = 0;
        
        int n = maps.length;
        int m = maps[0].length;
        count = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(count[i], -1);
        }
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        count[0][0] = 1;
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (maps[nx][ny] == 1 && count[nx][ny] == -1) {
                        count[nx][ny] = count[cur[0]][cur[1]] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        
        return count[n - 1][m - 1];
    }
}