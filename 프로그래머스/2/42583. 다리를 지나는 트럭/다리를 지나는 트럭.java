import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < bridge_length - 1; i++) {
            queue.add(0);
        }
        queue.add(truck_weights[0]);
        
        int answer = 1;
        int sum = truck_weights[0];
        int idx = 1;
        while (!queue.isEmpty()) {
            
            answer++;
            sum -= queue.poll();
            
            if (idx < truck_weights.length) {
                if (truck_weights[idx] + sum <= weight) {
                    queue.add(truck_weights[idx]);
                    sum += truck_weights[idx];
                    idx++;
                } else {
                    queue.add(0);
                }
            }
            
        }
        
        return answer;
    }
}