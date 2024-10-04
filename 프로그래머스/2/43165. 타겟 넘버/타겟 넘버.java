class Solution {
    
    int count = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, '+', 0);
        dfs(numbers, target, 0, '-', 0);
        
        return count;
    }
    
    private void dfs(int[] numbers, int target, int cur, char op, int idx) {
        
        if (op == '-') {
            cur -= numbers[idx];
        } else {
            cur += numbers[idx];
        }
        
        if (idx == numbers.length - 1) {
            if (target == cur) {
                count++;
                return;
            }
        } else {
            dfs(numbers, target, cur, '+', idx + 1);
            dfs(numbers, target, cur, '-', idx + 1);
        }
        
    }
}