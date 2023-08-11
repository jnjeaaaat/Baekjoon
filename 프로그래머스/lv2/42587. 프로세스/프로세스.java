import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        List<Integer> queue = new LinkedList<>();
        int target = priorities[location]; // 타겟 정보 저장
        priorities[location] = 0; // 큐에 있을 수 없는 값으로 변경

        for (int n : priorities) { // 리스트에 복사
            queue.add(n);
        }

        while (!queue.isEmpty()) {
            int now = queue.remove(0);
            int check = 0;

            for (int i = 0; i < queue.size(); i++) {
                if (now == 0) { // 현재가 타겟일 때는
                    if (target < queue.get(i)) { // 저장한 타겟 값과 비교
                        queue.add(now); check = 1; break;
                    } else continue;
                } else if (queue.get(i) == 0 && now < target) { // 타겟과 만나면 타겟 값으로 비교
                    queue.add(now); check = 1; break;
                } else if (now < queue.get(i)) { // 일반적으로 비교
                    queue.add(now); check = 1; break;
                }
            }

            if (check == 0 && now == 0) return answer; // add가 일어나지 않고 현재가 타겟이면 리턴
            if (check == 0) answer++; // add가 일어나지 않고 현재가 타겟이 아니면 숫자만 올림

        }

        return answer;
    }
}