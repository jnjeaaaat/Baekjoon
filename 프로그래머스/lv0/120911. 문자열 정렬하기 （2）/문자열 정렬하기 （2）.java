import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] result = answer.toCharArray();
        Arrays.sort(result);
        answer = new String(result);
        return answer;
    }
}