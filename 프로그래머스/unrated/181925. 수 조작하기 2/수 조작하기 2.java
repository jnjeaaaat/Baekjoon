class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for (int i = 1; i < numLog.length; i++) {
            int after = numLog[i];
            int before = numLog[i-1];
            
            if (after - before == 1) {
                answer += "w";
            } else if (after - before == -1) {
                answer += "s";
            } else if (after - before == 10) {
                answer += "d";
            } else if (after - before == -10) {
                answer += "a";
            }
        }
        
        return answer;
    }
}