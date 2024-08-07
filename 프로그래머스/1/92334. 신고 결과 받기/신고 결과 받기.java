import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> map = new HashMap<>(); // 본인이 신고당한 횟수
        List<String>[] list = new List[id_list.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < report.length; i++) {
            String[] temp = report[i].split(" ");
            
            for (int j = 0; j < id_list.length; j++) {
                if (temp[0].equals(id_list[j])) {
                    if (!list[j].contains(temp[1])) {
                        list[j].add(temp[1]);
                        map.put(temp[1], map.getOrDefault(temp[1], 0) + 1);
                        break;
                    }
                }
            }
            
            
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= k) {
                
                for (int i = 0; i < list.length; i++) {
                    if (list[i].contains(entry.getKey())) {
                        answer[i]++;
                    }
                }
            }
        }
        
        return answer;
    }
}