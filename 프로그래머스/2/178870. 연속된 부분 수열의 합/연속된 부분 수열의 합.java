class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        int start = 0;
        int end = 1;
        int min = Integer.MAX_VALUE;
        int sum = sequence[start];
        while (start < end) {
            if (sum == k) {
                if (min > end - start) {
                    min = end - start;
                    answer[0] = start;
                    answer[1] = end - 1;
                }
                sum -= sequence[start];
                start++;
            } else if (sum > k) {
                sum -= sequence[start];
                start++;
            } else if (end < sequence.length) {
                sum += sequence[end];
                end++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}