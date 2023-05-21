class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        for (int i = 0; i < my_string.length() / m; i++) {
            String temp = my_string.substring(i * m, (i + 1) * m);
            answer += temp.charAt(c-1);
        }
        return answer;
    }
}