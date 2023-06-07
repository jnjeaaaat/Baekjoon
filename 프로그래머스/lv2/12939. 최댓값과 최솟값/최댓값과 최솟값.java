import java.util.*;

class Solution {
    public String solution(String s) {
        String[] temp = s.split(" ");
        int[] num = new int[temp.length];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(temp[i]);
        }
        
        Arrays.sort(num);
        return num[0] + " " + num[num.length - 1];
    }
}