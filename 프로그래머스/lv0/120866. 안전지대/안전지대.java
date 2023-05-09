class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] dots = new int[board.length][board.length];

        for (int i = 0; i < dots.length; i++) {
            dots[i] = board[i].clone();
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    if (i-1 >= 0) {
                        if (j-1 >= 0) dots[i-1][j-1] = 1;
                        if (j+1 < board.length) dots[i-1][j+1] = 1;
                        dots[i-1][j] = 1;
                    }

                    if (j-1 >= 0) dots[i][j-1] = 1;
                    if (j+1 < board.length) dots[i][j+1] = 1;

                    if (i+1 < board.length) {
                        if (j-1 >= 0) dots[i+1][j-1] = 1;
                        if (j+1 < board.length) dots[i+1][j+1] = 1;
                        dots[i+1][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots.length; j++) {
                if (dots[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}