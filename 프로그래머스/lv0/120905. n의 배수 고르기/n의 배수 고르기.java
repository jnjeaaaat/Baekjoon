import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                numbers.add(numlist[i]);
            }
        }
        
        return numbers.stream().mapToInt(e->e).toArray();
    }
}