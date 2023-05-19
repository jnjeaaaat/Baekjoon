import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < answer.length; i++) {
            int[] temp = Arrays.copyOfRange(arr, queries[i][0], queries[i][1] + 1);
            List<Integer> num = new ArrayList<>();
            
            Arrays.sort(temp);
            
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] > queries[i][2]) num.add(temp[j]);
            }
            
            answer[i] = num.size() == 0 ? -1 : num.get(0);
        }
        
        return answer;
    }
}