import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> queue = new LinkedList<>();
        /*
         * Queue Interface 에는 
         * offerLast(), offerFirst(), pollFirst(), pollLast()
         * 메소드가 없기 때문에
         * LinkedList 로 생성
         */
        
        int queueSize = scanner.nextInt(); // 큐의 크기
        int needNum = scanner.nextInt();   // 필요한 숫자 개수
        int[] numbers = new int[needNum];  // 필요한 숫자들
        int count = 0;  // 연산 횟수

        // 필요한 숫자들 입력
        for (int i = 0; i < needNum; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 큐 초기화
        for (int i = 1; i <= queueSize; i++) {
            queue.offer(i); // 예외 발생 없이 false, true 리턴하는 offer() 사용
        }

        for (int i = 0; i < needNum; i++) {
            int numIndex = queue.indexOf(numbers[i]); // 최소값을 구하기 위해 어디 위치하는지 저장
            int middleIndex = (queue.size() % 2 == 0) ? (queue.size() / 2 - 1) : (queue.size() / 2); // 가운데를 기준으로 양쪽을 봐야하기 때문에 위치 저장

            if (numIndex <= middleIndex) { // 찾는 숫자가 중간보다 앞이면
                for (int j = 0; j < numIndex; j++) { // 그 수의 인덱스까지만 체크하기 때문에 peek으로 비교하는 과정은 필요없음
                    queue.offerLast(queue.pollFirst()); // 원소가 앞쪽에 있으면 앞에서 꺼내서 뒤에서 추가
                    count++; // 2번 연산 count
                }
            } else {
                for (int j = 0; j < queue.size() - numIndex; j++) {
                    queue.offerFirst(queue.pollLast()); // 원소가 뒤쪽에 있으면 뒤에서 꺼내서 앞으로 추가
                    count++; // 3번 연산 count
                }
            }
            queue.pollFirst(); // 2번 3번 연산이 끝나면 원하는 원소가 맨 앞으로 온 것. 바로 poll 수행

        }

        System.out.println(count);

    }
}