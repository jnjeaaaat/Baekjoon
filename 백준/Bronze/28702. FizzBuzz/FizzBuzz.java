import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = new String[3];

        for (int i = 0; i < 3; i++) {
            strArr[i] = br.readLine();
        }

        int ans = 0;
        for (int i = 0; i < strArr.length; i++) {
            String cur = strArr[i];

            if (!(cur.equals("Fizz") || cur.equals("Buzz") || cur.equals("FizzBuzz"))) {
                ans = Integer.parseInt(cur) + (3 - i);
                break;
            }
        }

        if (ans % 3 == 0 && ans % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (ans % 5 == 0) {
            System.out.println("Buzz");
        } else if (ans % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(ans);
        }
    }
}