import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        List<Integer> numbers = new ArrayList<>();
        int temp = total;
        int sum = total-1;
        if (total == 0) {
            for (int i = 0; i < num; i++) {
                numbers.add(-num/2 + i);
            }
            return numbers.stream().mapToInt(i -> i).toArray();
        }
        
        while (sum != total) {
            sum = 0;
            for (int i = 0; i < num; i++) {
                sum += temp - i;
            }
            if (sum == total) {
                for (int i = 0; i < num; i++) {
                    numbers.add(temp-i);
                }
            }
            temp--;
        }

        int[] answer = numbers.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}