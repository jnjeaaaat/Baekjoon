class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int eab = 2 * a * b;
        
        return ab >= eab ? ab : eab;
    }
}