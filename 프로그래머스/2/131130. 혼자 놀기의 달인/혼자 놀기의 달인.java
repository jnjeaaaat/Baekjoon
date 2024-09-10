// 카드 총 100장 있음
// 자연수 하나를 정해 그 수 보다 작거나 ㄱㅌ은 숫자들 준비함
// 카드를 한장씩 넣고 무작위로 섞어 일렬로 나열
// 1번부터 순차적으로 즈가하는 번호 붙임
// 처음에 숫자 선택해서 열린거 번호 상자를 열어
// 이미 열린상자일때까지 반복


class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        
        int[] selection = new int[2];
        boolean[] check = new boolean[cards.length];
        for (int i = 0; i < cards.length; i++) {
            
            
            int cur = cards[i] - 1;
            int count = 0;
            while (!check[cur]) {
                check[cur] = true;
                cur = cards[cur] - 1;
                count++;
            }
            
            if (selection[0] <= selection[1]) {
                
                if (selection[0] <= count) {
                    selection[0] = count;
                }
            } else {
                if (selection[1] <= count) {
                    selection[1] = count;
                }
            }
            
            answer = Math.max(answer, selection[0] * selection[1]);
        }
        
        return answer;
    }
}