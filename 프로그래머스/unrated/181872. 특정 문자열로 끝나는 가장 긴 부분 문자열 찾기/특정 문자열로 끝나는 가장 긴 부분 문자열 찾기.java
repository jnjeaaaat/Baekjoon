class Solution {
    public String solution(String myString, String pat) {
        while (true) {
            if (myString.endsWith(pat)) {
                return myString;
            }
            
            myString = myString.substring(0, myString.length() - 1);
        }
    }
}