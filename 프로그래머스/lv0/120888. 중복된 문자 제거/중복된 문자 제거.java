class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] temp = my_string.split("");

        for (int i = 0; i < temp.length; i++) {
            if (!sb.toString().contains(temp[i])) {
                sb.append(temp[i]);
            }
        }
        return sb.toString();
    }
}