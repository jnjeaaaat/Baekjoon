class Solution {
    public int solution(int order) {
        int answer = 0;
        int count = 0;
        int order2 = order;
        while (order > 0) {
            order /= 10;
            count++;
        }

        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = order2 % 10;
            if (numbers[i] != 0 && numbers[i]%3 == 0) {
                answer++;
            }
            order2 /= 10;
        }

        return answer;
    }
}