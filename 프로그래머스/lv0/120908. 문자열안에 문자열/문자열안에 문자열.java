class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        String temp = "";
        for (int i = 0; i < str1.length()-(str2.length()-1); i++) {
            temp = str1.substring(i,str2.length()+i);
            if (temp.equals(str2)) {
                answer = 1;
                return answer;
            }
        }
        return answer;
    }
}