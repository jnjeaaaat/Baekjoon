class Solution {
    public int solution(int[] number) {
        int count = 0;
        for (int i = 0; i < number.length - 2; i++) {
            
            int first = number[i];
            for (int j = i + 1; j < number.length - 1; j++) {
                
                int second = number[j];
                for (int k = j + 1; k < number.length; k++) {
                    
                    int third = number[k];
                    if (first + second + third == 0) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}