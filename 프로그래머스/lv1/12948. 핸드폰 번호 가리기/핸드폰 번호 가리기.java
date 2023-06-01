class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] temp = phone_number.split("");
        
        for (int i = 0; i < temp.length - 4; i++) {
            temp[i] = "*";
        }
        
        answer = String.join("", temp);
        
        return answer;
    }
}