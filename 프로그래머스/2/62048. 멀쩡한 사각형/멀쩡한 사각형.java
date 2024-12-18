class Solution {
    public long solution(int w, int h) {
        long answer = (long) w * h - ((w / gcd(w, h)) + (h / gcd(w, h)) - 1) * gcd(w, h);
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
    }
}