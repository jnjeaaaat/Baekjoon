import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] result = polynomial.split(" ");
        int xSum = 0, sum = 0;

        for (int i = 0; i < result.length; i++) {
            if (result[i].equals("x")) {
                xSum++;
            } else if (result[i].contains("x")) {
                xSum += Integer.parseInt(result[i].substring(0, result[i].length() - 1));
            } else if (!result[i].equals("+")) {
                sum += Integer.parseInt(result[i]);
            }
        }

        if (xSum != 0 && sum != 0) {
            if (xSum == 1) {
                answer = "x + " + sum;
            } else {
                answer = xSum + "x" + " + " + sum;
            }
        } else if (xSum == 0 && sum != 0) {
            answer = "" + sum;
        } else if (xSum != 0 && sum == 0) {
            if (xSum == 1) {
                answer = "x";
            } else {
                answer = xSum + "x";
            }
        }
        return answer;
    }
}