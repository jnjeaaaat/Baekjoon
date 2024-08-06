import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] Xarr = new int[10];
        int[] Yarr = new int[10];
        for (int i = 0; i < X.length(); i++) {
            Xarr[X.charAt(i) - '0']++;
        }
        
        for (int i = 0; i < Y.length(); i++) {
            Yarr[Y.charAt(i) - '0']++;
        }
        
        for (int i = Xarr.length - 1; i >= 0; i--) {
            if (Xarr[i] != 0 && Yarr[i] != 0) {
                for (int j = 0; j < Math.min(Xarr[i], Yarr[i]); j++) {
                    sb.append(i);
                }
            }
        }
        
        if (sb.toString().equals("")) {
            sb.append("-1");
        } else if (sb.toString().charAt(0) == '0') {
            sb = new StringBuilder("0");
        }
        
        return sb.toString();
    }
}