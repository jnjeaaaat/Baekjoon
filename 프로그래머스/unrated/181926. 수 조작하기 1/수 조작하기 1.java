class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] c = control.split("");
        
        for (String key : c) {
            switch (key) {
                case "w" :
                    answer += 1;
                    break;
                case "s" :
                    answer -= 1;
                    break;
                case "d" :
                    answer += 10;
                    break;
                case "a" :
                    answer -= 10;
            }
        }
        
        return answer;
    }
}