class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]" , "");
        System.out.println(my_string);
        String[] number = my_string.split("");
        for (int i = 0; i < number.length; i++) {
            answer += Integer.parseInt(number[i]);
        }

        return answer;
    }
}