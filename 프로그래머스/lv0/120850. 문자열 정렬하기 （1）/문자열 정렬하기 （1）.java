import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        StringBuilder sb = new StringBuilder();
        char[] alpha = my_string.toCharArray();

        for (int i : alpha) {
            if (i < 97) {
                sb.append(i-48);
            }
        }
        answer = new int[sb.length()];
        String[] n = sb.toString().split("");
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(n[i]);
        }
        
        Arrays.sort(answer);

        return answer;
    }
}