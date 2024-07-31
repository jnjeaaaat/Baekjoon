class Solution {
    public int solution(int[][] lines) {
        int[] duplication = new int[201];
        for (int i = 0; i < 3; i++) {
            
            int a = lines[i][0];
            int b = lines[i][1];
            for (int j = a; j < b; j++) {
                duplication[j + 100]++;
            }
        }
        
        int count = 0;
        for (int i = 0; i < duplication.length; i++) {
            if (duplication[i] > 1) {
                count++;
            }
        }
        
        return count;
    }
}