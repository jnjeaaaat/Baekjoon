class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        
        int[] alpha = new int[26];
        for (int i = 0; i < survey.length; i++) {
            
            if (choices[i] == 4) {
                continue;
            }
            
            if (choices[i] < 4) {
                alpha[survey[i].charAt(0) - 'A'] += (4 - choices[i]);
            } else if (choices[i] > 4) {
                alpha[survey[i].charAt(1) - 'A'] += (choices[i] - 4);
            }
        }
        
        char[] check = new char[4];
        for (int i = 0; i < alpha.length; i++) {
            if (i == 'R' - 'A') {
                if (alpha[i] >= alpha['T' - 'A']) {
                    check[0] = 'R';
                } else {
                    check[0] = 'T';
                }
            } else if (i == 'C' - 'A') {
                if (alpha[i] >= alpha['F' - 'A']) {
                    check[1] = 'C';
                } else {
                    check[1] = 'F';
                }
            } else if (i == 'J' - 'A') {
                if (alpha[i] >= alpha['M' - 'A']) {
                    check[2] = 'J';
                } else {
                    check[2] = 'M';
                }
            } else if (i == 'A' - 'A') {
                if (alpha[i] >= alpha['N' - 'A']) {
                    check[3] = 'A';
                } else {
                    check[3] = 'N';
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            sb.append(check[i]);
        }
        
        return sb.toString();
    }
}