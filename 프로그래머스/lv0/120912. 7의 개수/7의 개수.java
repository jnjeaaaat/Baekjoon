class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        String[] s = sb.toString().split("");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("7")) {
                answer++;
            }
        }
        return answer;
    }
}