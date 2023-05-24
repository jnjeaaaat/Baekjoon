class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] ch = myString.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') {
                ch[i] = 'A';
            } else {
                if (ch[i] != 'A') {
                    ch[i] = Character.toLowerCase(ch[i]);
                }
            }
        }
        
        for (int i = 0; i < ch.length; i++) {
            answer += ch[i];
        }
        
        return answer;
    }
}