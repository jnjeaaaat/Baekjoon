class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length() % n == 0 ? my_str.length() / n : (my_str.length() / n) + 1];
        System.out.println(answer.length);

        for (int i = 0; i < answer.length; i++) {
            int begin = i * n;
            int end = begin + n;
            if (end > my_str.length()) {
                end = my_str.length();
            }
            answer[i] = my_str.substring(begin, end);
        }
        return answer;
    }
}