class Solution {
    public int[] solution(int n) {
        int[] answer = new int[0];
        if (n % 2 == 0) {
            answer = new int[n/2];
        } else if (n % 2 != 0) {
            answer = new int[(n+1)/2];
        }

        int m = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                answer[m] = i;
                m++;
            }
        }
        return answer;
    }
}