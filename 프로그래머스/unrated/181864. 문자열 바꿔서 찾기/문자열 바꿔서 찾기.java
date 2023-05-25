class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] temp = myString.split("");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals("A")) {
                temp[i] = "B";
            } else {
                temp[i] = "A";
            }
        }
        
        myString = String.join("", temp);
        return myString.contains(pat) ? 1 : 0;
    }
}