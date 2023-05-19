class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] list_string = my_string.split("");
        
        for (int i : index_list) {
            answer += list_string[i];
        }
        
        return answer;
    }
}