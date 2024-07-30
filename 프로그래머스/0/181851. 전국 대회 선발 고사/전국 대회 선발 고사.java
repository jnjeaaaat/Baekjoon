import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<Node> pq = new PriorityQueue();
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                pq.add(new Node(i, rank[i]));
            }
        }
        
        int answer = 0;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                answer += (10000 * pq.poll().idx);
            } else if (i == 1) {
                answer += (100 * pq.poll().idx);
            } else if (i == 2) {
                answer += pq.poll().idx;
            }
        }
        
        return answer;
    }

}

class Node implements Comparable<Node> {
    int idx;
    int rank;
    
    public Node(int idx, int rank) {
        this.idx = idx;
        this.rank = rank;
    }
    
    public int compareTo(Node o) {
        return Integer.compare(this.rank, o.rank);
    }
    
}