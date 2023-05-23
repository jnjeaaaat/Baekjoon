import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) end = i;
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) start = i;
        }
        
        if (start == 0 && end == 0) {
            return new int[]{-1};
        }
        
        for (int i = start; i <= end; i++) {
            answer.add(arr[i]);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}