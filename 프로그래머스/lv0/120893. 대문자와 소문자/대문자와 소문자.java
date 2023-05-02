class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] alpha = my_string.toCharArray();
        int a = 'a', z = 'z';
        int A = 'A', Z = 'Z';
        System.out.println(a + "," + z + "," + A + "," + Z);
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] >= 97 && alpha[i] <= 122 ) {
                answer += String.valueOf(alpha[i]).toUpperCase();
            } else if (alpha[i] >= 65 && alpha[i] <= 90) {
                answer += String.valueOf(alpha[i]).toLowerCase();
            }
        }

        return answer;
    }
}