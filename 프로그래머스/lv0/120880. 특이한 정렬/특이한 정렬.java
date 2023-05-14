import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Arrays.sort(numlist);
        int minIndex = 0;
        
        for (int i = 0; i < answer.length; i++) {
            int min = 9999;
            
            for (int j = 0; j < numlist.length; j++) {
                if (min >= Math.abs(numlist[j] - n)) {
                    min = Math.abs(numlist[j] - n);
                    minIndex = j;
                }
            }
            answer[i] = numlist[minIndex];
            numlist[minIndex] = 20001;
        }

        return answer;
    }
}