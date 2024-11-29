class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        
        int n = cards.length;
        boolean[] visited = new boolean[n];
        int[] selection = new int[2];
        for (int i = 0; i < n; i++) {
            
            int cur = cards[i] - 1;
            
            int count = 0;
            while (!visited[cur]) {
                visited[cur] = true;
                cur = cards[cur] - 1;
                count++;
            }
            
            if (selection[0] <= selection[1]) {
                if (selection[0] <= count) {
                    selection[0] = count;
                }
            } else {
                if (selection[1] <= count) {
                    selection[1] = count;
                }
            }
            
            answer = Math.max(answer, selection[0] * selection[1]);
        }
        
        return answer;
    }
}