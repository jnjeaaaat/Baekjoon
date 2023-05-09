class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int num = b/gcp(a,b);
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (isPrime(i) == 1) {
                    if (i != 2 && i != 5) {
                        answer = 2;
                    }
                }
            }
        }
        return answer;
    }

    public int gcp(int a, int b) {
        if (b == 0) return a;
        return gcp(b, a % b);
    }

    public int isPrime(int n) {
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) cnt++;
        }
        return cnt;
    }
}