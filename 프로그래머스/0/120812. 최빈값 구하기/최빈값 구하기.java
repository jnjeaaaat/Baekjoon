class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int[] mode = new int[1001];
        for (int i = 0; i < array.length; i++) {
            mode[array[i]]++;
        }
        
        int max = 0;
        int maxIdx = 0;
        boolean flag = false;
        for (int i = 0; i < mode.length; i++) {
            if (max < mode[i]) {
                max = mode[i];
                maxIdx = i;
                flag = false;
            } else if (max == mode[i]) {
                flag = true;
            }
        }
        
        return flag ? -1 : maxIdx;
    }
}