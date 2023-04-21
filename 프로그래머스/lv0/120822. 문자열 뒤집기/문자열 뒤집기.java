import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] answers = my_string.split("");
        String[] temp = new String[answers.length];
        for (int i = 0; i < answers.length; i++) {
            temp[i] = answers[answers.length-1-i];
        }
        answer = String.join("",temp);

        return answer;
    }
}