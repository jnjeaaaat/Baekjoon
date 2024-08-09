class Solution {
    static StringBuilder sb = new StringBuilder();
    static int[] leftPos = new int[]{3, 0};
    static int[] rightPos = new int[]{3, 2};
    static int[][] numPos = new int[][]{
                {3, 1}, // 0
                {0, 0}, // 1
                {0, 1}, // 2
                {0, 2}, // 3
                {1, 0}, // 4
                {1, 1}, // 5
                {1, 2}, // 6
                {2, 0}, // 7
                {2, 1}, // 8
                {2, 2}, // 9
            };
    
    public String solution(int[] numbers, String hand) {
//         int[] leftPos = new int[]{3, 0};
//         int[] rightPos = new int[]{3, 2};
//         int[][] numPos = new int[][]{
//             {3, 1}, // 0
//             {0, 0}, // 1
//             {0, 1}, // 2
//             {0, 2}, // 3
//             {1, 0}, // 4
//             {1, 1}, // 5
//             {1, 2}, // 6
//             {2, 0}, // 7
//             {2, 1}, // 8
//             {2, 2}, // 9
//         };
        
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int cur = numbers[i];
            leftSum = Math.abs(leftPos[0] - numPos[cur][0]);
            leftSum += Math.abs(leftPos[1] - numPos[cur][1]);
            
            rightSum = Math.abs(rightPos[0] - numPos[cur][0]);
            rightSum += Math.abs(rightPos[1] - numPos[cur][1]);
            
            if (cur == 3 || cur == 6 || cur == 9) {
                moveFinger("R", cur);
            } else if (cur == 1 || cur == 4 || cur == 7) {
                moveFinger("L", cur);
            } else {
                if (leftSum < rightSum) {
                    moveFinger("L", cur);
                } else if (leftSum > rightSum) {
                    moveFinger("R", cur);
                } else {
                    if (hand.equals("left")) {
                        moveFinger("L", cur);
                    } else {
                        moveFinger("R", cur);
                    }
                }
            }
        }
        
        return sb.toString();
    }
    
    private static void moveFinger(String hand, int num) {
        
        sb.append(hand);
        if (hand.equals("L")) {
            leftPos = numPos[num];
        } else {
            rightPos = numPos[num];
        }
        
    }
}