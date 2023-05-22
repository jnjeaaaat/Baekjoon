class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] temp = my_string.split("");
        
        for (int i = 0; i < indices.length; i++) {
            temp[indices[i]] = "";
        }
        
        answer = String.join("", temp);
        return answer;
    }
}