import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < targets.length; i++) {
            list.add(new Node(targets[i][0], targets[i][1]));
        }
        
        Collections.sort(list);
        
        int end = 0;
        for (Node node : list) {
            if (node.start >= end) {
                end = node.end;
                answer++;
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
        int result = Integer.compare(this.end, o.end);
        
//         if (result == 1) {
//             result = Integer.compare(this.start, o.start);
//         }
        
        return result;
    }
}