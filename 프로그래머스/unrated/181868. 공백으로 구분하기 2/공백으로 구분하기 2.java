import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        String[] temp = my_string.split(" ");
        
        for (String a : temp) {
            if (!a.equals("")) answer.add(a);
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}