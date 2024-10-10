import java.util.*;

class Solution {
    
    boolean[] visited;
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        
        visited = new boolean[numbers.length()];
        dfs(numbers, "", 0);
        
        for (int num : set) {
            if (num > 1 && isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private void dfs(String numbers, String str, int depth) {
        
        if (depth > numbers.length()) {
            return;
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                
                set.add(Integer.parseInt(str + numbers.charAt(i)));
                dfs(numbers, str + numbers.charAt(i), depth + 1);
                
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}