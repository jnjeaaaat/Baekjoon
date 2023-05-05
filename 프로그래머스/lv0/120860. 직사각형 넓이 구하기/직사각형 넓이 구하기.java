class Solution {
    public int solution(int[][] dots) {
        int width = 0, height = 0;
        int[] x = new int[4];
        int[] y = new int[4];

        for (int i = 0; i < 4; i++) {
            x[i] = dots[i][0];
            y[i] = dots[i][1];
        }

        int xValue = x[0], yValue = y[0];

        for (int i = 0; i < 4; i++) {
            if (xValue != dots[i][0]) width = Math.abs(xValue - dots[i][0]);
            if (yValue != dots[i][1]) height = Math.abs(yValue - dots[i][1]);
        }

        return width * height;
    }
}