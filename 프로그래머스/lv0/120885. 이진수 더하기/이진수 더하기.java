import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int bin1Int = Integer.parseInt(bin1, 2);
        int bin2Int = Integer.parseInt(bin2, 2);
        
        int sum = bin1Int + bin2Int;
        answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}