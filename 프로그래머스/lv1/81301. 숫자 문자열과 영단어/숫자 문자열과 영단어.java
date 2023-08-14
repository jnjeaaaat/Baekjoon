class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] >= '0' && charArr[i] <= '9') {
                sb.append(charArr[i]);
            } else {
                switch (charArr[i]) {
                    case 'o':
                        if (charArr[i+1] == 'n') {
                            sb.append(1);
                            i += 2;
                        }
                        break;
                    case 't':
                        if (charArr[i+1] == 'w') {
                            sb.append(2);
                            i += 2;
                        } else if (charArr[i+1] == 'h') {
                            sb.append(3);
                            i += 4;
                        }
                        break;
                    case 'f':
                        if (charArr[i+1] == 'o') {
                            sb.append(4);
                            i += 3;
                        } else if (charArr[i+1] == 'i') {
                            sb.append(5);
                            i += 3;
                        }
                        break;
                    case 's':
                        if (charArr[i+1] == 'i') {
                            sb.append(6);
                            i += 2;
                        } else if (charArr[i+1] == 'e') {
                            sb.append(7);
                            i += 4;
                        }
                        break;
                    case 'e':
                        if (charArr[i+1] == 'i') {
                            sb.append(8);
                            i += 4;
                        }
                        break;
                    case 'n':
                        if (charArr[i+1] == 'i') {
                            sb.append(9);
                            i += 3;
                        }
                        break;
                    case 'z':
                        sb.append(0);
                        i += 3;
                        break;
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}