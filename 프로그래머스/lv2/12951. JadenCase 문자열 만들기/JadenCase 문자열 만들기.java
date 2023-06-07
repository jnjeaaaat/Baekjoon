class Solution {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split("");
        int idx = 0;
        
        for (String str : temp) {
            if (str.equals(" ")) {
                answer += str;
                idx = 0;
            } else {
                if (idx == 0) {
                    answer += str.toUpperCase();
                } else {
                    answer += str.toLowerCase();
                }
                
                idx++;
            }
        }
        
        return answer;
    }
}