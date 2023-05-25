import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] temp = myString.split("x");
        List<String> answer = new ArrayList<>();

        for (String s : temp) {
            if (s.length() != 0) {
                answer.add(s);
            }
        }

        Collections.sort(answer);

        return answer.toArray(new String[answer.size()]);
    }
}