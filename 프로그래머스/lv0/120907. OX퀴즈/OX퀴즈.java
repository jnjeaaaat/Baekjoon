class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < answer.length; i++) {
            String[] ob = quiz[i].split(" ");
            int left = Integer.parseInt(ob[0]);
            int right = Integer.parseInt(ob[2]);
            int result = Integer.parseInt(ob[4]);
            
            if (ob[1].equals("+")) {
                if (left + right == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (ob[1].equals("-")) {
                if (left - right == result) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}