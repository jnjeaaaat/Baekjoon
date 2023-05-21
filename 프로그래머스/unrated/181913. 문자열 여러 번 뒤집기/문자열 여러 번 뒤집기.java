class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            StringBuilder temp = new StringBuilder();
            if (queries[i][1] < answer.length() - 1) {
                temp = new StringBuilder(sb.substring(queries[i][0], queries[i][1] + 1));
            } else if (queries[i][1] == answer.length() - 1) {
                temp = new StringBuilder(sb.substring(queries[i][0]));
            }
            sb = sb.replace(queries[i][0], queries[i][1] + 1, temp.reverse().toString());

        }

        return sb.toString();
    }
}