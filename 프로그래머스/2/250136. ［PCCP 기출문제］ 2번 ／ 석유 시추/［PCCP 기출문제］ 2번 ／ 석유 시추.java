import java.util.*;

class Solution {
    
    static boolean[][] visited;
    static int[][] board;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[] sum;
    static int n, m;
    
    public int solution(int[][] land) {
        n = land.length;
        m = land[0].length;
        board = land;
        visited = new boolean[n][m];
        sum = new int[m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;
                    
                    bfs(i, j);
                }
            }
        }
        
        int max = 0;
        for (int i = 0; i < m; i++) {
            max = Math.max(max, sum[i]);
        }
        
        return max;
    }
    
    private void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        
        int count = 1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            set.add(cur[1]);
            
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && board[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        count++;
                        queue.add(new int[]{nx, ny});
                        set.add(ny);
                    }
                }
            }
        }
        
        for (int idx : set) {
            sum[idx] += count;
        }
        
    }
}