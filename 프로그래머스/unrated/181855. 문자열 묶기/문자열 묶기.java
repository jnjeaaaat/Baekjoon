import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] n = new int[30];
        
        for (int i = 0; i < strArr.length; i++) {
            n[strArr[i].length() - 1]++;
        }
        
        Arrays.sort(n);
        answer = n[n.length - 1];;
        
        return answer;
    }
}