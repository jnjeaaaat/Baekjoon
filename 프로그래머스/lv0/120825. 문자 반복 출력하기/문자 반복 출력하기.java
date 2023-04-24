class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] val = my_string.split("");
        String[] temp = new String[val.length*n];

        for (int i = 0; i < val.length; i++) {
            for (int j = i * n; j < n + (i * n); j++) {
                temp[j] = val[i];
            }
        }
        answer = String.join("",temp);
        return answer;
    }
}