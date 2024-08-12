import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        for (int m = 0; m < moves.length; m++) {
            
            int cur = moves[m] - 1;
            for (int i = 0; i < board.length; i++) {
                if (board[i][cur] != 0) {
                    
                    if (!stack.isEmpty()) {
                        
                        if (board[i][cur] == stack.peek()) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(board[i][cur]);
                        }
                    } else {
                        stack.push(board[i][cur]);
                    }
                    
                    board[i][cur] = 0;
                    break;
                }
            }
            
        }
        
        return answer;
    }
}