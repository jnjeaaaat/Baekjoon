class Solution {
    public int solution(int balls, int share) {
        return (int) Math.round(fac(balls) / (fac(balls-share)*fac(share)));
    }

    public double fac(int num) {
        if (num <= 0) return 1;
        return num * fac(num-1);
    }
}