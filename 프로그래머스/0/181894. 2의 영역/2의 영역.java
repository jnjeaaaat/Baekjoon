import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int front = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                front = i;
                break;
            }
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        
        int[] answer;
        if (front == -1 && end == -1) {
            answer = new int[]{-1};
        } else if (front != -1 && end == -1) {
            answer = Arrays.copyOfRange(arr, front, front + 1);
        } else {
            answer = Arrays.copyOfRange(arr, front, end + 1);
        }
        
        return answer;
    }
}