class Solution {
    public String solution(String s) {
        String answer = "";

        char[] c = s.toCharArray();
        int[] num = new int[26];

        for (int i = 0; i < c.length; i++) {
            num[c[i]-'a']++;
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                answer += String.valueOf((char) (i + 'a'));
            }
        }

        return answer;
    }
}