import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sList = s.split("");
        
        Arrays.sort(sList, Collections.reverseOrder());
        
        for (String a : sList) {
            answer += a;
        }
        
        return answer;
    }
}