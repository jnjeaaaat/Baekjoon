class Solution {
    public int solution(int n) {
        int answer = 0;
        int k = 0;
        while (k <= n) {
            answer++;
            if ((answer % 3) == 0) {
                answer++;
            }
            if ((answer % 10) == 3) {
                answer++;
            }
            if (((answer%100)/10) == 3) {
                answer += 10;
            }
            k++;
        }
        return answer;
    }
}