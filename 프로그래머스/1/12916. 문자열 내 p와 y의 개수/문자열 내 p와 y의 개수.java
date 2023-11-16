class Solution {
    boolean solution(String s) {
        int[] py = new int[2];

        for (char ch : s.toCharArray()) {
            if (Character.toLowerCase(ch) == 'p') {
                py[0]++;
            } else if (Character.toLowerCase(ch) == 'y') {
                py[1]++;
            }
        }

        return py[0] == py[1];
    }
}