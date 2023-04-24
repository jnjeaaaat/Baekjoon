class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while (2 * i <= n) {
            answer += 2 * i;
            i++;
        }
        return answer;
    }
}