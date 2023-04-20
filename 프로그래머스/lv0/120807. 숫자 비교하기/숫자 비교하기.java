class Solution {
    public int solution(int num1, int num2) {
        boolean result = (0 <= num1 && 10000 >= num1 && 0 <= num2 && 10000 >= num2);
        if (result) {
            if (num1 == num2) {
                return 1;
            }
        }
        return -1;
    }
}