class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (int i = 0; i < dic.length; i++) {
            int sum = 0;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    sum++;
                }
            }
            
            if (sum == dic[i].length() && dic[i].length() == spell.length) {
                answer = 1;
                return answer;
            }
        }

        return answer;
    }
}