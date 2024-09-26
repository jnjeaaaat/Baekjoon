import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                
                if (stack.isEmpty()) {
                    stack.push(ch);
                } else {
                    if (stack.peek() == '(' && ch == ')') {
                        stack.pop();
                    } else if (stack.peek() == '{' && ch == '}') {
                        stack.pop();
                    } else if (stack.peek() == '[' && ch == ']') {
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
            }
            
            for (int j = 0; j < i; j++) {
                char ch = s.charAt(j);
                
                if (stack.isEmpty()) {
                    stack.push(ch);
                } else {
                    if (stack.peek() == '(' && ch == ')') {
                        stack.pop();
                    } else if (stack.peek() == '{' && ch == '}') {
                        stack.pop();
                    } else if (stack.peek() == '[' && ch == ']') {
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
            }
            
            if (stack.isEmpty()) {
                answer++;
            }
            
        }
        
        return answer;
    }
}