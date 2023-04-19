class Solution {
    public int solution(int num1, int num2) {
        boolean result = (0 < num1 && 100 >= num1 && 0 < num2 && 100 >= num2);
        if (result) {
            return num1 / num2;
        }
        return 0;
    }
}