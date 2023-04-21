class Solution {
    public int solution(int n) {
        int[] sixTimes = new int [n];
        int[] nTimes = new int[6];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            sixTimes[i] = 6*(i+1);
        }

        for (int i = 0; i < 6; i++) {
            nTimes[i] = n*(i+1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                if (sixTimes[i] == nTimes[j]) {
                    answer = sixTimes[i]/6;
                    return answer;
                }
            }
        }

        return answer;
    }
}