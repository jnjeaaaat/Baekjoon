import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int numLength = 0;

        for (int i : arr) {
            if (i % divisor == 0) {
                numLength++;
            }
        }

        if (numLength == 0) {
            return new int[]{-1};
        }
        
        int[] answer = new int[numLength];

        int j = 0;
        for (int i : arr) {
            if (i % divisor == 0) {
                answer[j] = i;
                j++;
            }
        }
        
        Arrays.sort(answer);

        return answer;
    }
}