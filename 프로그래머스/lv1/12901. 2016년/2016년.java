class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int countDay = b - 1;
        int[] last = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};

        for (int i = 0; i < a - 1; i++) {
            countDay += last[i];
        }

        answer = day[countDay % 7];
        return answer;
    }
}