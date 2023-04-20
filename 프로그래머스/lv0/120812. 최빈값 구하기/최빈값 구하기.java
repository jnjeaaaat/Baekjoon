class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int max = 0;
        int temp = 0;
        int amount[] = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            amount[array[i]]++;
            
            if(max < amount[array[i]]) {
                max = amount[array[i]];
                answer = array[i];
            }
        }
        
        for(int j = 0; j < 1000; j++) {
            if(max == amount[j]) temp++;
            if(temp > 1) answer = -1;
        }
        
        return answer;
    }
}