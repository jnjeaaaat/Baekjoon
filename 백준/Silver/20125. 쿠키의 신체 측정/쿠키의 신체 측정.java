import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] board = new char[n][n];

        Node head = null;
        int leftArm = 0;
        int rightArm = 0;
        int waist = 0;
        int leftLeg = 0;
        int rightLeg = 0;

        loop:
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j);

                // 머리 위치
                if (head == null &&
                        board[i][j] == '*' &&
                        j > 0 &&
                        board[i][j - 1] == '_') {
                    head = new Node(i, j);

                    continue loop;
                } else if (head != null && i == head.x + 1) {
                    if (j < head.y && board[i][j] == '*') {
                        leftArm++;
                    } else if (j > head.y && board[i][j] == '*') {
                        rightArm++;
                    }
                } else if (head != null && i > head.x + 1 && j == head.y && board[i][j] == '*') {
                    waist++;
                } else if (head != null && i > head.x + 2 && j < head.y && board[i][j] == '*') {
                    leftLeg++;
                } else if (head != null && i > head.x + 2 && j > head.y && board[i][j] == '*') {
                    rightLeg++;
                }
            }
        }

        System.out.println((head.x + 2) + " " + (head.y + 1));
        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);

    }

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
