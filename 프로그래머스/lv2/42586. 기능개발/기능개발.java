import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        LinkedList<Integer> deque = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            // 모든 큐를 돌면서, 남은 일수를 갱신
            int days = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] > 0) {
                days += 1;
            }
            deque.offer(days);
        }

        while (!deque.isEmpty()) {
            int currentValue = deque.poll();
            int count = 1;

            while (!deque.isEmpty() && currentValue >= deque.peek()) {
                deque.poll();
                count++;
            }

            answer.add(count);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
