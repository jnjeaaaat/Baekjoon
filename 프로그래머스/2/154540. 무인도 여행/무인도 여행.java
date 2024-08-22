import java.util.*;

class Solution {
    
    List<Integer> list = new ArrayList<>();
    boolean[][] visited;
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    int sum = 0;
    
    public int[] solution(String[] maps) {
        
        int idx = 0;
        visited = new boolean[maps.length][maps[0].length()];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                if (!visited[i][j] && maps[i].charAt(j) != 'X') {
                    bfs(maps, i, j);
                    list.add(sum);
                }
            }
        }
        
        if (list.isEmpty()) {
            list.add(-1);
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private void bfs(String[] maps, int x, int y) {
        int n = maps.length;
        int m = maps[0].length();
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        sum = maps[x].charAt(y) - '0';
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (maps[nx].charAt(ny) != 'X' && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                        sum += maps[nx].charAt(ny) - '0';
                    }
                }
            }
        }
    }
}