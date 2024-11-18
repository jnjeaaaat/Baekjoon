import java.util.*;

class Solution {
    
    static Map<String, List<Integer>> map = new HashMap<>();
    
    public int[] solution(String[] info, String[] query) {
        
        int[] answer = new int[query.length];
        
        for (int i = 0; i < info.length; i++) {
            dfs(info[i].split(" "), "", 0);
        }
        
        for (List<Integer> list : map.values()) {
            Collections.sort(list);
        }
        
        for (int i = 0; i < query.length; i++) {
            answer[i] = binarySearch(query[i]);
        }
        
        return answer;
        
    }
    
    private void dfs(String[] info, String str, int depth) {
        
        if (depth == 4) {
            
            int score = Integer.parseInt(info[depth]);
            
            if (map.containsKey(str)) {
                map.get(str).add(score);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(score);
                map.put(str, list);
            }
            
            return;
        }
        
        dfs(info, str + "-", depth + 1);
        dfs(info, str + info[depth], depth + 1);
        
    }
    
    private int binarySearch(String query) {
        
        String[] temp = query.split(" and ");
        int score = Integer.parseInt(temp[3].split(" ")[1]);
        
        String condition = temp[0] + temp[1] + temp[2] + temp[3].split(" ")[0];
        
        if (!map.containsKey(condition)) {
            return 0;
        }
        
        List<Integer> list = map.get(condition);
        int left = 0;
        int right = list.size();
        
        while (left < right) {
            int mid = (left + right) / 2;
            
            if (list.get(mid) >= score) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return list.size() - left;
        
    }
}