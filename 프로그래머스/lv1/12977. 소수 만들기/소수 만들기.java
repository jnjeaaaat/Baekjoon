class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int m = j + 1; m < nums.length; m++) {
                    int sum = nums[i] + nums[j] + nums[m];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    public boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        
        if (count < 3) {
            return true;
        }
        
        return false;
    }
}