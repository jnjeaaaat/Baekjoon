import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int[] temp = arr.clone();
        Arrays.sort(arr);
        
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != arr[0]) {
                answer.add(temp[i]);
            }
        }
        
        if (answer.size() == 0) {
            answer.add(-1);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}