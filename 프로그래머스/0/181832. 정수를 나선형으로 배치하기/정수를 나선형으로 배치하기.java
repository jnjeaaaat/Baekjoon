class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int i = 0;
        int j = 0;
        int direction = 0; // 0 1 2 3 오 아 왼 위
        for (int num = 1; num <= n * n; num++) {            
            answer[i][j] = num;

            if (direction == 0) {
                if (j == n - 1 || answer[i][j + 1] != 0) {
                    direction = 1;
                    i++;
                } else {
                    j++;
                }
            }
            
            else if (direction == 1) {
                if (i == n - 1 || answer[i + 1][j] != 0) {
                    direction = 2;
                    j--;
                } else {
                    i++;
                }
                
            }
            
            else if (direction == 2) {
                if (j == 0 || answer[i][j - 1] != 0) {
                    direction = 3;
                    i--;
                } else {
                    j--;
                }
                
            }
            
            else if (direction == 3) {
                if (i == 0 || answer[i - 1][j] != 0) {
                    direction = 0;
                    j++;
                } else {
                    i--;
                }
                
            }
            
        }
        
        return answer;
    }
}