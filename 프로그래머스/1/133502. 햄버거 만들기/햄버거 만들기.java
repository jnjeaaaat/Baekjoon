import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        /*
        빵 1
        야채 2
        고기 3
        빵 1
        */
        
        int[] burger = new int[]{1, 2, 3, 1};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            
            if (ingredient[i] == 1 && stack.size() >= 4) {
                
                int idx = 0;
                boolean flag = true;
                for (int j = stack.size() - 4; j < stack.size(); j++) {
                    if (stack.get(j) != burger[idx++]) {
                        flag = false;
                    }
                }
                
                if (flag) {
                    answer++;
                    for (int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                }
            }
            
            
        }
        
        return answer;
    }
}