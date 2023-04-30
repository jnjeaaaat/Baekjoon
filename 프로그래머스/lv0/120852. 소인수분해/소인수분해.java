class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && n % i == 0) {
                sb.append(i);
                sb.append(" ");
            }
        }

        String[] number = sb.toString().split(" ");
        answer = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            answer[i] = Integer.parseInt(number[i]);
        }
        return answer;
    }

    public boolean isPrime(int num) {
        int cnt = 0;
        boolean result = true;
        for (int i = num; i >= 2; i--) {
            if (num % i == 0) {
                cnt++;
            }
        }
        if (cnt >= 2) {
            result = false;
        }
        return result;
    }
}