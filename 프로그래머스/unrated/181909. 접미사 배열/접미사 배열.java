import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> val = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            String temp = my_string.substring(i);
            val.add(temp);
        }

        Collections.sort(val);
        return val.toArray(new String[val.size()]);
    }
}