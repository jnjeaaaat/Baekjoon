import java.util.*;

class Solution {
    
    static int[][] pic;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    
    public int[] solution(int m, int n, int[][] picture) {
        
        pic = picture;
        visited = new boolean[m][n];
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] > 0 && !visited[i][j]) {
                    numberOfArea++;
                    int count = bfs(i, j, picture[i][j]);
                    maxSizeOfOneArea = Math.max(count, maxSizeOfOneArea);
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    private int bfs(int x, int y, int color) {
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        
        int count = 1;
        
        while (!queue.isEmpty()) {
            
            int[] cur = queue.poll();
            
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];

                if (nx >= 0 && nx < pic.length && ny >= 0 && ny < pic[0].length) {
                    if (!visited[nx][ny] && pic[nx][ny] == color) {
                        visited[nx][ny] = true;
                        count++;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
            
        }
        
        
        return count;
    }
}