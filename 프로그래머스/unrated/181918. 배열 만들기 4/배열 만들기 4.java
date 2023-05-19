import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            }
            // System.out.println(i);
            // System.out.println(stk.get(stk.size() - 1));
            if (stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
            } else {
                stk.add(arr[i]);
                i++;
            }
        }
        
        return stk.stream().mapToInt(e -> e).toArray();
    }
}