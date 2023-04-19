class Solution {
    public int solution(int num1, int num2) {
        boolean result = (-50000 <= num1 && 50000 >= num1 && -50000 <= num2 && 50000 >= num2);
        if (result) {
            return num1+num2;
        }
        return -1;
    }
}