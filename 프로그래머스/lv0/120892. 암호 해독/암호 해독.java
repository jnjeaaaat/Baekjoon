class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = 1; code * i <= cipher.length(); i++) {
            answer += cipher.substring(code * i - 1, code * i);
        }

        return answer;
    }
}