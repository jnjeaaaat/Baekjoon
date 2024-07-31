import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] rank = new int[emergency.length];
        
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < emergency.length; i++) {
            list.add(new Node(i, emergency[i]));
        }
        
        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            rank[list.get(i).idx] = i + 1;
        }
        
        return rank;
    }
}

class Node implements Comparable<Node> {
    int idx;
    int amount;
    
    Node(int idx, int amount) {
        this.idx = idx;
        this.amount = amount;
    }
    
    public int compareTo(Node o) {
        return Integer.compare(o.amount, this.amount);
    }
}