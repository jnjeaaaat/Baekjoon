class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] result = my_string.split("");
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals("a") || result[i].equals("e") || result[i].equals("i") || result[i].equals("o") || result[i].equals("u")) {
                answer = answer.replace(result[i],"");
            }
        }
        return answer;
    }
}