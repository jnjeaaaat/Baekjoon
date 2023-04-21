class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int k = 0;
        for (int i = answer.length-1; i >= 0; i--) {
            answer[i] = num_list[k];
            k++;
        }
        return answer;
    }
}