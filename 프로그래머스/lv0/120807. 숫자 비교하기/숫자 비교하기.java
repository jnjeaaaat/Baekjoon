class Solution {
    public int solution(int num1, int num2) {
        boolean result = (0 <= num1 && 10000 >= num1 && 0 <= num2 && 10000 >= num2);
        int answer = 0;
        
        if(result) {
            answer = (num1==num2) ? 1 : -1;
        }
        return answer;
    }
}