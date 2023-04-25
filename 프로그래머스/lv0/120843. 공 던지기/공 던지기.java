class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int m = 0;

        for (int i = 0; i < k; i++) {
            if (m >= numbers.length) {
                m -= numbers.length;
            }
            answer = numbers[m];
            m += 2;
        }
        return answer;
    }
}