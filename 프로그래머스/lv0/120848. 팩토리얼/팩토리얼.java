class Solution {
    public int solution(int n) {
        int answer = 0;
        while (factorial(answer) <= n) {
            answer++;
        }
        return answer-1;
    }

    public int factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num-1);
    }
}