class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] alpha = my_string.toCharArray();
        int a = 'a', z = 'z';
        int A = 'A', Z = 'Z';
        System.out.println(a + "," + z + "," + A + "," + Z);
        for (int i = 0; i < alpha.length; i++) {
            if (Character.isUpperCase(alpha[i])) {
                answer += String.valueOf(alpha[i]).toLowerCase();
            } else if (Character.isLowerCase(alpha[i])) {
                answer += String.valueOf(alpha[i]).toUpperCase();
            }
        }

        return answer;
    }
}