class Solution {
    public int solution(int hp) {
        int answer = 0;
        while (hp > 2) {
            if (hp >= 5) {
                hp -= 5;
                answer++;
            } else if (hp >= 3) {
                hp -= 3;
                answer++;
            }
        }
        answer += hp;
        return answer;
    }
}