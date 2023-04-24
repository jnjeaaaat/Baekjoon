class Solution {
    public int solution(int num1, int num2) {
        boolean val = (0 < num1 && 100 >= num1 && 0 < num2 && 100 >= num2);
        int answer = -1;
        
        if (val) {
            answer = num1 % num2;
        }
        return answer;
    }
}