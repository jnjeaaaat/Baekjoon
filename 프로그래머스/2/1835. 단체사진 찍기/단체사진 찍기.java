class Solution {
    static int answer;
    static boolean[] visited;
    static char[] members;
    
    public int solution(int n, String[] data) {
        
        answer = 0;
        members = new char[]{'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
        visited = new boolean[8];
        
        dfs(data, "", 0);
        
        return answer;
    }
    
    private void dfs(String[] data, String str, int depth) {
        
        if (depth == 8) {
            
            boolean flag = true;
            for (String d : data) {
                char m1 = d.charAt(0);
                char m2 = d.charAt(2);
                char op = d.charAt(3);
                int requestGap = d.charAt(4) - '0';
                
                int curGap = Math.abs(str.indexOf(m1) - str.indexOf(m2)) - 1;
                
                if (op == '=') {
                    if (curGap != requestGap) {
                        flag = false;
                        break;
                    }
                } else if (op == '<') {
                    if (curGap >= requestGap) {
                        flag = false;
                        break;
                    }
                } else if (op == '>') {
                    if (curGap <= requestGap) {
                        flag = false;
                        break;
                    }
                }
            }
            
            if (flag) {
                answer++;
            }
            
            return;
        }
            
        
        for (int i = 0; i < members.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(data, str + members[i], depth + 1);
                visited[i] = false;
            }
        }
    }
}