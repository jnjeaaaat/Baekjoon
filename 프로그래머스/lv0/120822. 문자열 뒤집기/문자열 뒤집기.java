import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] answers = my_string.split("");
        for (int i = 0; i < answers.length; i++) {
            answer += answers[answers.length-1-i];
        }

        return answer;
    }
}