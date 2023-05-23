class Solution {
    public String[] solution(String[] names) {
        int len = names.length;
        String[] answer = new String[len % 5 == 0 ? len / 5 : len / 5 + 1];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = names[i * 5];
        }
        
        return answer;
    }
}