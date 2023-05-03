class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int min = sides[0] <= sides[1] ? sides[0] : sides[1];
        int max = sides[0] + sides[1];
        answer += min;
        
        int i = max - min + 1;
        while (max > i) {
            answer++;
            i++;
        }
        return answer;
    }
}