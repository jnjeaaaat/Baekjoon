import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int count = 0;
    public static int k = 0;
    public static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // n 입력
        k = Integer.parseInt(st.nextToken()); // k 입력

        int[] A = new int[n + 1]; // root는 0으로 채워서 비워놔야 한다.

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken()); // A배열 채우기
        }

        heapSort(A, n); // 함수를 호출해도 더 이상 바꿀 게 없다면 그냥 빠져나옴

        if (!flag) {
            /*
             * heapSort 함수를 빠져나왔다는 것은
             * heap의 정렬이 모두 끝난것을 의미
             * 정렬이 완료 되었어도 k보다 작다면
             * -1을 출력
             */
            System.out.println(-1);
        }

    }

    public static void heapSort(int[] A, int n) {
        buildMinHeap(A, n);
        for (int i = n; i > 1; i--) {
            swap(A, 1, i);
            heapify(A, 1, i - 1);
        }
    }

    public static void swap(int[] A, int a, int b) {
        count++; // swap 할때 count 증가

        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;

        if (count == k) { // count하다가 k수 만큼 교환을 했다면
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < A.length; i++) {
                sb.append(A[i]);
                sb.append(" ");
            }
            System.out.println(sb);
            flag = true; // 원하는 횟수만큼 교환했거나 정렬을 마쳐서 더이상 교환할 필요가 없기 때문에 true로 바꿔줌
        }
    }

    public static void buildMinHeap(int[] A, int n) {
        for (int i = n / 2; i > 0; i--) {
            heapify(A, i, n);
        }
    }

    public static void heapify(int[] A, int k, int n) {
        int left = 2 * k;
        int right = 2 * k + 1;
        int smaller = -1;

        if (right <= n) {
            smaller = A[left] < A[right] ? left : right;
        } else if (left <= n) {
            smaller = left;
        } else {
            return;
        }

        if (A[smaller] < A[k]) {
            swap(A, k, smaller);
            heapify(A, smaller, n);
        }
    }
}
