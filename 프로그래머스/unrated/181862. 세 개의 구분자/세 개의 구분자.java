import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] temp = myStr.split("[abc]");
        List<String> answer = new ArrayList<>();
        
        for (String s : temp) {
            if (s.length() != 0) {
                answer.add(s);
            }
        }
        
        if (answer.size() == 0) {
            answer.add("EMPTY");
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}