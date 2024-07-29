class Solution {
    public int[] solution(String myString) {
        int xCnt = 0;
        int first = -1;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                xCnt++;
                
                if (first == -1) {
                    first = i;
                }
            }

        }
        
        int[] answer = new int[xCnt + 1];
        answer[0] = first;
        int index = 1;
        int count = 0;
        for (int i = first + 1; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                count++;
            } else {
                answer[index++] = count;
                count = 0;
            }

        }
        
        if (count != 0) {
            answer[xCnt] = count;
        }
        
        return answer;
    }
}