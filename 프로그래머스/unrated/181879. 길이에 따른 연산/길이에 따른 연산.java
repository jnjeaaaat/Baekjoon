import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int len = num_list.length;
        
        for (int i : num_list) {
            answer *= i;
        }
        
        return len > 10 ? Arrays.stream(num_list).sum() : answer;
    }
}