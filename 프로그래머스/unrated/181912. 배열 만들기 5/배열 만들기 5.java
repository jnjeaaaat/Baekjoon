import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String n : intStrs) {
            if (Integer.parseInt(n.substring(s, s + l)) > k) {
                answer.add(Integer.parseInt(n.substring(s, s + l)));
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}