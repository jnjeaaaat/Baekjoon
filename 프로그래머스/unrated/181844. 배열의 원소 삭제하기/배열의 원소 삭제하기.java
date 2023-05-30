import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    flag = false;
                }
            }
            
            if (flag) {
                answer.add(arr[i]);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}