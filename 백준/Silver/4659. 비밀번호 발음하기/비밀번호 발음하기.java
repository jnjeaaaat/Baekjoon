import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static char[] vowelArr = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = null;
        while (!(str = br.readLine()).equals("end")) {
            sb.append("<").append(str).append("> is ");

            if (oneVowel(str) && three(str) && two(str)) {
                sb.append("acceptable.\n");
            } else {
                sb.append("not acceptable.\n");
            }

        }

        System.out.println(sb);

    }

    private static boolean oneVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (char ch : vowelArr) {
                if (str.charAt(i) == ch) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean three(String str) {
        int vowelCount = 0;
        int consCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                consCount = 0;
            } else {
                consCount++;
                vowelCount = 0;
            }

            if (vowelCount == 3 || consCount == 3) {
                return false;
            }
        }

        return true;
    }

    private static boolean two(String str) {

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                if (str.charAt(i) != 'e' && str.charAt(i) != 'o') {
                    return false;
                }
            }
        }

        return true;
    }
}
