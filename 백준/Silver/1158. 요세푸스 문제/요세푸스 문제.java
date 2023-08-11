import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] josep = new int[n]; // 요세푸스 순열을 담을 배열

        // 1 부터 n 까지의 정수 list 에 삽입
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }
        k--; // k는 몇 번째 인지를 의미하고 index 는 0부터 시작하기 때문에 하나 줄이고 시작

        int index = 0;
        int i = 0; // 요세푸스 배열 인덱스 관리 i
        while (list.size() > 0) {
            index = (index + k) % list.size();
            /*
             * index가 list의 크기보다 커지면 다시 처음으로 돌아와야 하기 때문에 %연산을 이용
             * list.remove()를 사용하면 알아서 크기가 하나 줄기 때문에
             * 처음 입력받은 k보다 하나 줄여서 사용한다.
             */
            josep[i] = list.get(index); // 요세푸스 배열 하나씩 채우기
            list.remove(Integer.valueOf(josep[i])); // Integer.valueOf()로 찾은 값 지우기

            i++; // 요세푸스 배열 인덱스 증가
        }

        System.out.print("<");
        for (int j = 0; j < josep.length; j++) {
            System.out.print(josep[j]);
            if (j != josep.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }
}