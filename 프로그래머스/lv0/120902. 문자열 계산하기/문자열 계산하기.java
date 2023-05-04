class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] op = my_string.split(" ");
        answer += Integer.parseInt(op[0]);

        for (int i = 0; i < op.length; i++) {
            if (op[i].equals("+")) {
                answer += Integer.parseInt(op[i+1]);
            } else if (op[i].equals("-")) {
                answer -= Integer.parseInt(op[i+1]);
            }
        }

        return answer;
    }
}