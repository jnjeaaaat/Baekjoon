class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0, 0};

        int width = board[0] % 2 == 0 ? board[0]/2 : (board[0] - 1)/2;
        int height = board[1] % 2 == 0 ? board[1]/2 : (board[1] - 1)/2;

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("up")) {
                if (answer[1] != height) answer[1]++;
            } else if (keyinput[i].equals("down")) {
                if (answer[1] != height - height*2) answer[1]--;
            } else if (keyinput[i].equals("right")) {
                if (answer[0] != width) answer[0]++;
            } else if (keyinput[i].equals("left")) {
                if (answer[0] != width - width*2) answer[0]--;
            }
        }
        return answer;
    }
}