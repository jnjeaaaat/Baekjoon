class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int cnt = 0, i = 0, temp = num;
        while (temp != 0) {
            temp /= 10;
            cnt++;
        }
        System.out.println(cnt);
        while (num != 0) {
            if (num % 10 == k) {
                answer = cnt-i;
            }
            num /= 10;
            i++;
        }
        return answer;
    }
}