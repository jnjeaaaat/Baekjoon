class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder temp = new StringBuilder(my_string.substring(s, e + 1));
        
        return sb.replace(s, e+1, temp.reverse().toString()).toString();
    }
}