import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        String[] answer = new String[players.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            String player = callings[i]; // 추월한 선수
            int rank = map.get(player); // 추월한 선수 현재 등수
            String frontPlayer = players[rank - 1];
            
            players[rank - 1] = player;
            map.put(frontPlayer, rank); // 앞 선수가 추월한 선수 등수가 됨
            
            players[rank] = frontPlayer;
            map.put(player, rank - 1);
        }
        
        return players;
    }
}