import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numbers.add(i);
            }
        }

        int[] answer = new int[numbers.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers.get(i);
        }
        return answer;
    }
}