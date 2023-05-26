import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        int i = 1;
        
        while (i < arr.length) {
            if (answer.size() != 0) {
                if (answer.get(answer.size() - 1) == arr[i]) {
                    answer.remove(answer.size() - 1);
                } else {
                    answer.add(arr[i]);
                }
            } else {
                answer.add(arr[i]);
            }
            
            i++;
        }
        
        if (answer.size() == 0) {
            answer.add(-1);
        }
        
        return answer.stream().mapToInt(e -> e).toArray();
    }
}