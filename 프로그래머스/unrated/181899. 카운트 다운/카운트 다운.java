import java.util.stream.*;

class Solution {
    public int[] solution(int start, int end) {
//         int[] answer = new int[start - end + 1];
//         int i = 0;
        
//         while (start >= end) {
//             answer[i] = start;
//             start -= 1;
            
//             i++;
//         }
//         return answer;
        
        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
    }
}