import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Node> list = new ArrayList<>();
        
        s = s.replace("},{", "}{");
        
        int index = 0;
        list.add(new Node());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            
            if (ch == '}') {
                String[] strArr = sb.toString().split(",");
                
                for (int k = 0; k < strArr.length; k++) {
                    list.get(index).set.add(Integer.parseInt(strArr[k]));
                    list.get(index).count++;
                }
                
                sb.setLength(0);
                index++;
                list.add(new Node());
            } else if (ch != '{') {
                sb.append(ch);
            }
            
        }
        
        Collections.sort(list);
        
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            
            for (int n : list.get(i).set) {
                if (!answer.contains(n)) {
                    answer.add(n);
                }
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}

class Node implements Comparable<Node> {
    Set<Integer> set;
    int count = 1;
    
    Node() {
        this.set = new HashSet<>();
    }
    
    public int compareTo(Node o) {
        return Integer.compare(this.count, o.count);
    }
}