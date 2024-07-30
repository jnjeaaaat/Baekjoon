class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] alpha = new char[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (alpha[i] == 1) {
                sb.append((char) (i + 'a'));
            }
        }
        
        return sb.toString();
    }
}