import java.util.*;

class Solution {
    
    int[][] count;
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    
    public int solution(String[] maps) {
        int answer = 0;
        
        int[] start = new int[2];
        int[] lever = new int[2];
        int[] exit = new int[2];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                
                char cur = maps[i].charAt(j);
                if (cur == 'S') {
                    start[0] = i;
                    start[1] = j;
                }
                
                if (cur == 'L') {
                    lever[0] = i;
                    lever[1] = j;
                }
                
                if (cur == 'E') {
                    exit[0] = i;
                    exit[1] = j;
                }
            }
        }
        
        boolean[] check = new boolean[2];
        count = new int[maps.length][maps[0].length()];
        bfs(maps, start[0], start[1], lever[0], lever[1]);
        answer = count[lever[0]][lever[1]];
        if (count[lever[0]][lever[1]] != 0) {
            check[0] = true;
        }
        
        count = new int[maps.length][maps[0].length()];
        bfs(maps, lever[0], lever[1], exit[0], exit[1]);
        answer += count[exit[0]][exit[1]];
        if (count[exit[0]][exit[1]] != 0) {
            check[1] = true;
        }
        
        return check[0] && check[1] ? answer : -1;
    }
    
    private void bfs(String[] maps, int sx, int sy, int ex, int ey) {
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{sx, sy});
        
        //System.out.println(count[sx][sy]);
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            
            // System.out.println("cur : " + cur[0] + " " + cur[1]);
            // System.out.println("count : " + count[cur[0]][cur[1]]);
            if (cur[0] == ex && cur[1] == ey) {
                break;
            }
            
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];
                
                if (nx >= 0 && nx < count.length && ny >= 0 && ny < count[0].length) {
                    if (maps[nx].charAt(ny) != 'X' && count[nx][ny] == 0) {
                        count[nx][ny] = count[cur[0]][cur[1]] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}