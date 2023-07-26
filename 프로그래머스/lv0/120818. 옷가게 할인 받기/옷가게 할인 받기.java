class Solution {
    public int solution(int price) {
        int answer = price;
        
        if (answer >= 500000) {
            answer = (int) (price * 0.80);
        } else if (answer >= 300000) {
            answer = (int) (price * 0.90);
        } else if (answer >= 100000) {
            answer = (int) (price * 0.95);
        }
        
        return answer;
    }
}