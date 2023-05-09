class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] line = new int[200];

        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                line[j + 100]++;
            }
        }

        for (int num : line) {
            if (num > 1) answer++;
        }
        return answer;
    }
}