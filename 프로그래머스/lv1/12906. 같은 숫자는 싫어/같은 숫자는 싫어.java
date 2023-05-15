import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> numbers = new ArrayList<>();
        numbers.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != numbers.get(numbers.size() - 1)) {
                numbers.add(arr[i]);
            }
        }

        return numbers.stream().mapToInt(i -> i).toArray();
    }
}