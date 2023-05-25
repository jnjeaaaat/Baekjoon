class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] temp = binomial.split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[2]);
        
        switch (temp[1]) {
            case "+" :
                answer = a + b;
                break;
            case "-" :
                answer = a - b;
                break;
            case "*" :
                answer = a * b;
        }
        
        return answer;
    }
}