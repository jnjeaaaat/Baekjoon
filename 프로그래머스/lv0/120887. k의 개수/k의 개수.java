class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int m = i; m <= j; m++) {
            if (String.valueOf(m).contains(String.valueOf(k))) {
                for (String s : String.valueOf(m).split("")) {
                    if (s.equals(String.valueOf(k))) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}