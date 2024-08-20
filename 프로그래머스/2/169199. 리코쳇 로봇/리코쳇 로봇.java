import java.util.*;

class Solution {
    
    boolean[][] visited;
    int[] robot = new int[2];
    int[] goal = new int[2];
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    
    public int solution(String[] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                if (board[i].charAt(j) == 'R') {
                    robot[0] = i;
                    robot[1] = j;
                }
                
                if (board[i].charAt(j) == 'G') {
                    goal[0] = i;
                    goal[1] = j;
                }
            }
        }
        
//         visited = new boolean[board.length][board[0].length()];
        return bfs(board);
    }
    
    private int bfs(String[] board) {
        int n = board.length;;
        int m = board[0].length();
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{robot[0], robot[1], 0});
        visited = new boolean[n][m];
        visited[robot[0]][robot[1]] = true;
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            
            if (cur[0] == goal[0] && cur[1] == goal[1]) {
                return cur[2];
            }
            
            for (int d = 0; d < 4; d++) {
                int nx = cur[0];
                int ny = cur[1];
                
                while (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length()
                      && board[nx].charAt(ny) != 'D') {
                    
                    nx += dx[d];
                    ny += dy[d];
                    
                }
                
                nx -= dx[d];
                ny -= dy[d];

                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, cur[2] + 1});
                }
            }
            
        }
        
        return -1;
    }
}