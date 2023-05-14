class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            boolean check = true;
            for (int i = 0; i < word.length; i++) {
                s = s.replaceAll(word[i]," ");
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') {
                    check = false;
                }
            }

            if (check) {
                answer++;
            }
        }
        return answer;
    }
}