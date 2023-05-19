import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        String[] num = {"1", "2", "3", "4", "6", "7", "8", "9"};
        for (int i = l; i <= r; i++) {
            boolean flag = true;
            for (int j = 0; j < num.length; j++) {
                if (String.valueOf(i).contains(num[j])) {
                    flag = false;
                }
            }

            if (flag) {
                answer.add(i);
            }
        }

        if (answer.size() == 0) {
            answer.add(-1);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}