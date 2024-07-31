class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] temp = my_string.split("[a-z]|[A-Z]");
        
        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].equals("")) {
                answer += Integer.parseInt(temp[i]);
            }
        }
        
        return answer;
    }
}