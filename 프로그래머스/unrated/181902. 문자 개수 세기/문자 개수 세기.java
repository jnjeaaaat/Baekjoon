import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        HashMap<String, Integer> map = new HashMap<>();

        for (char c : my_string.toCharArray()) {
            String s = String.valueOf(c);

            if (map.containsKey(s)) {
                map.replace(s, (map.get(s) + 1));
            } else {
                map.put(s, 1);
            }
        }

        for (String temp : map.keySet()) {
            if (Character.isUpperCase(temp.charAt(0))) {
                answer[temp.charAt(0) - 'A'] = map.get(temp);
            } else if (Character.isLowerCase(temp.charAt(0))){
                answer[temp.charAt(0) - 'A' - 6] = map.get(temp);
            }
        }
        return answer;
    }
}