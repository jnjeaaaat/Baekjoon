class Solution {
    public int[] solution(String myString) {
        String[] temp = myString.split("x");
        int[] answer = new int[myString.endsWith("x") ? temp.length + 1 : temp.length];
        
        for (int i = 0; i < temp.length; i++) {
            answer[i] = temp[i].length();
        }
        
        return answer;
    }
}