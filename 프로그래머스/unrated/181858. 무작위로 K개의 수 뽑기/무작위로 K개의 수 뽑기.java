import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        Set<Integer> used = new HashSet<>();
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!used.contains(arr[i])) {
                answer[m++] = arr[i];
                used.add(arr[i]);
            }
            
            if (used.size() >= k) {
                return answer;
            }
        }
        
        return answer;
    }
}