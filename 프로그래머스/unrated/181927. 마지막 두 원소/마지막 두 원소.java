class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int first = num_list[num_list.length - 1];
        int second = num_list[num_list.length - 2];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        answer[answer.length - 1] = first > second ? first - second : first * 2;
        
        return answer;
    }
}