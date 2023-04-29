class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int sum = sides[0] + sides[1] + sides[2];
        for (int i = 0; i < 3; i++) {
            if (max < sides[i]) {
                max = sides[i];
            }
        }
        
        if (sum-max <= max) {
            answer = 2;
        } else if (sum-max > max) {
            answer = 1;
        }
        return answer;
    }
}