import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                answer = answer.subList(0, query[i] + 1);
            } else {
                answer = answer.subList(query[i], answer.size());
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}