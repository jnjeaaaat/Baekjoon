class Solution {
    public String solution(String code) {
//         String answer = "";
//         String[] codeList = code.split("");
//         boolean mode = true;
        
//         for (int i = 0; i < codeList.length; i++) {
//             if (codeList[i].equals("1")) mode = !mode;
            
//             if (mode) {
//                 if (!codeList[i].equals("1") && i % 2 == 0) answer += codeList[i];
//             } else {
//                 if (!codeList[i].equals("1") && i % 2 != 0) answer+= codeList[i];
//             }
//         }
        
//         if (answer.length() == 0) {
//             answer = "EMPTY";
//         }
        int mode = 0;
        String answer = "";
        
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = 1 - mode;
            } else if (mode == 0 && i % 2 == 0) {
                answer += code.charAt(i);
            } else if (mode == 1 && i % 2 == 1) {
                answer += code.charAt(i);
            }
        }
        
        if (answer.length() == 0) {
            answer = "EMPTY";
        }
        
        return answer;
    }
}