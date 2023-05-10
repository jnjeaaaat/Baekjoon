class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String[] aStr = A.split("");
        while (!A.equals(B)) {
            if (answer > A.length()) {
                return -1;
            }
            String temp = aStr[aStr.length - 1];

            for (int i = aStr.length-1; i >= 1; i--) {
                aStr[i] = aStr[i-1];
            }

            aStr[0] = temp;
            A = String.join("",aStr);
            answer++;
        }
        return answer;
        
        // String tempB = B.repeat(3);
        // return tempB.indexOf(A);
    }
}