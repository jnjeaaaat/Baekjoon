class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] temp = num_str.split("");
        
        for (String s : temp) {
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}