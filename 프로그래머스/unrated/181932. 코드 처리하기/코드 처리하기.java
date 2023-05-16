class Solution {
    public String solution(String code) {
        String answer = "";
        String[] codeList = code.split("");
        boolean mode = true;
        
        for (int i = 0; i < codeList.length; i++) {
            if (codeList[i].equals("1")) mode = !mode;
            
            if (mode) {
                if (!codeList[i].equals("1") && i % 2 == 0) answer += codeList[i];
            } else {
                if (!codeList[i].equals("1") && i % 2 != 0) answer+= codeList[i];
            }
        }
        
        if (answer.length() == 0) {
            answer = "EMPTY";
        }
        
        return answer;
    }
}