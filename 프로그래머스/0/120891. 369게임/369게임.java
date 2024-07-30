class Solution {
    public int solution(int order) {
        int count = 0;
        while (order > 0) {
            int remain = order % 10;
            if (remain == 3 || remain == 6 || remain == 9) {
                count++;
            }
            
            order /= 10;
        }
        
        return count;
    }
}