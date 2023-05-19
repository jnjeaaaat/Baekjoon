class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] n = number.split("");
        int sum = 0;
        
        for (String a : n) {
            sum += Integer.parseInt(a);
        }
        
        answer = sum % 9;
        return answer;
    }
}