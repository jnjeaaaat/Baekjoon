import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] temp = new int[3];
        List<Integer> trueIndex = new ArrayList<>();
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                trueIndex.add(i);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            int min = 101, minIndex = 0;
            
            for (int j : trueIndex) {
                if (rank[j] < min) {
                    min = rank[j];
                    minIndex = j;
                }
            }
            
            temp[i] = minIndex;
            trueIndex.remove(trueIndex.indexOf(minIndex));
        }
        
        answer = temp[0] * 10000 + temp[1] * 100 + temp[2];
        return answer;
    }
}