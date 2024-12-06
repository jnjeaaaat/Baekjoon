import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        List<Node> list = new ArrayList<>();
        
        for (int i = 0; i < targets.length; i++) {
            int[] temp = targets[i];
            
            list.add(new Node(temp[0], temp[1]));
        }
        
        Collections.sort(list);
        
        int end = list.get(0).start;
        for (Node n : list) {
            if (n.start >= end) {
                answer++;
                end = n.end;
            }
        }
        
        return answer;
    }
}

class Node implements Comparable<Node> {
    int start;
    int end;
    
    Node(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    public int compareTo(Node o) {
        return Integer.compare(this.end, o.end);
    }
}