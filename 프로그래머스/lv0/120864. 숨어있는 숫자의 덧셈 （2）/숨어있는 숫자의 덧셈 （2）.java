class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] num = my_string.split("[a-zA-Z]");
        
        for (String n : num) {
            answer += n.isEmpty() ? 0 : Integer.parseInt(n);
        }
        
        return answer;
    }
}