import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < picture.length; i++) {
            List<String> temp = new ArrayList<>();
            String[] s = picture[i].split("");
            
            for (int j = 0; j < s.length; j++) {
                for (int m = 0; m < k; m++) {
                    temp.add(s[j]);
                }
            }
            
            for (int j = 0; j < k; j++) {
                answer.add(String.join("", temp.toArray(new String[temp.size()])));
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}