class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        String[] temp = rsp.split("");
        
        for (int i = 0; i < temp.length; i++) {
            switch (temp[i]) {
                case "2" :
                    sb.append("0");
                    break;
                case "0" :
                    sb.append("5");
                    break;
                case "5" :
                    sb.append("2");
                    break;
            }
        }
        return sb.toString();
    }
}