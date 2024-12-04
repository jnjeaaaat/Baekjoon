class Solution {
    
    static String[] map;
    
    public int solution(String[] board) {
        int answer = -1;
        
        map = board;
        
        int oCnt = 0;
        int xCnt = 0;
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (board[i].charAt(j) == 'O') {
                    oCnt++;
                } else if (board[i].charAt(j) == 'X') {
                    xCnt++;
                } else {
                    isFull = false;
                }
            }
        }
        
        if (isFull) {
            if (xCnt + 1 != oCnt) {
                answer = 0;
            } else {
                if (bingo('X')) {
                    answer = 0;
                } else {
                    answer = 1;
                }
            }
        } else {
            if (bingo('O') && bingo('X')) {
                answer = 0;
            } else if (bingo('O') && xCnt + 1 == oCnt) {
                answer = 1;
            } else if (bingo('X') && xCnt == oCnt) {
                answer = 1;
            } else if (!bingo('X') && !bingo('O') && (xCnt + 1 == oCnt || xCnt == oCnt)) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        
        if (oCnt == 0 && xCnt == 0) {
            answer = 1;
        }
        
        return answer;
    }
    
    private boolean bingo(char ch) {
        
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (map[i].charAt(j) == ch) {
                    count++;
                }
            }
            
            if (count == 3) {
                return true;
            }
        }
        
        for (int j = 0; j < 3; j++) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                if (map[i].charAt(j) == ch) {
                    count++;
                }
            }
            
            if (count == 3) {
                return true;
            }
        }
        
        if (map[0].charAt(0) == map[1].charAt(1) &&
            map[1].charAt(1) == map[2].charAt(2) &&
            map[2].charAt(2) == ch) {
            return true;
        }
        
        if (map[0].charAt(2) == map[1].charAt(1) &&
            map[1].charAt(1) == map[2].charAt(0) &&
            map[2].charAt(0) == ch) {
            return true;
        }
        
        return false;
    }
}