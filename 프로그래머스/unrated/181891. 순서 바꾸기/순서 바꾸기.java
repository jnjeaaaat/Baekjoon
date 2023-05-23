class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        for (int i = n; i < answer.length; i++) {
            answer[i - n] = num_list[i];
        }
        
        for (int i = 0; i < n; i++) {
            answer[answer.length - (n - i)] = num_list[i];
        }
        
        return answer;
    }
}