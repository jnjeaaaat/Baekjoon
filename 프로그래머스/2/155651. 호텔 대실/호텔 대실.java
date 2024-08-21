import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < book_time.length; i++) {
            String[] startTemp = book_time[i][0].split(":");
            String[] endTemp = book_time[i][1].split(":");
            
            int start = Integer.parseInt(startTemp[0]) * 60 + Integer.parseInt(startTemp[1]);
            int end = Integer.parseInt(endTemp[0]) * 60 + Integer.parseInt(endTemp[1]);
            
            list.add(new Node(start, end));
        }
        
        Collections.sort(list);
        
        List<Room> rooms = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            
            if (rooms.size() == 0) {
                rooms.add(new Room(list.get(i).end + 10));
                continue;
            }
            
            boolean flag = false;
            for (int j = 0; j < rooms.size(); j++) {
                if (rooms.get(j).end <= list.get(i).start) {
                    rooms.get(j).end = list.get(i).end + 10;
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                rooms.add(new Room(list.get(i).end + 10));
            }
        }
        
        return rooms.size();
    }
    
}

class Node implements Comparable<Node> {
    int start;
    int end;
    
    Node (int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    public int compareTo(Node o) {
        int result = Integer.compare(start, o.start);
        
        if (result == 0) {
            result = Integer.compare(end, o.end);
        }
        
        return result;
    }
}

class Room {
    int end;
    
    Room(int end) {
        this.end = end;
    }
}