class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int compare = 0;
        for (int i = 10; i >= 0; i--) {
            if ((int) Math.pow(2, i) >= arr.length) {
                compare = (int) Math.pow(2, i);
            }
        }
        
        answer = new int[compare];
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}