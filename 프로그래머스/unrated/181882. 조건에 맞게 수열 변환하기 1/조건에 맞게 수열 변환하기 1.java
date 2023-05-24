class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr;
        
        for (int i = 0; i < arr.length; i++) {
            if (answer[i] < 50) {
                if (answer[i] % 2 != 0) {
                    answer[i] *= 2;
                }
            } else {
                if (answer[i] % 2 == 0) {
                    answer[i] /= 2;
                }
            }
        }
        
        return answer;
    }
}