import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < enemy.length; i++) {
            n -= enemy[i];
            pq.add(enemy[i]);
            
            if (n < 0) {
                if (k > 0 && !pq.isEmpty()) {
                    k--;
                    n += pq.poll();
                } else {
                    answer = i;
                    break;
                }
            }
        }
        
        return answer;
    }
}