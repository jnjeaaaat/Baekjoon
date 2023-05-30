class Solution {
    public String solution(String n_str) {
        String answer = "";
        String[] temp = n_str.split("");
        int index = 0;
        for (int i = temp.length - 1; i >= 0; i--) {
            if (!temp[i].equals("0")) {
                index = i;
            }
        }
        
        for (int i = index; i < temp.length; i++) {
            answer += temp[i];
        }
        
        return answer;
    }
}