class Solution {
    public String solution(String new_id) {
        
        // 1
        new_id = new_id.toLowerCase();
        
        // 2
        char[] temp = new_id.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            char ch = temp[i];
            if (
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9') ||
                ch == '-' ||
                ch == '_' ||
                ch == '.'
            ) {
                sb.append(ch);
            }
        }
        
        new_id = sb.toString();
        
        // 3
        while (new_id.indexOf("..") != -1) {
            new_id = new_id.replace("..", ".");
        }
        
        // 4
        if (new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }
        
        if (new_id.length() > 0) {
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        
        // 5
        if (new_id.isEmpty()) {
            new_id = "a";
        }
        
        // 6
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }
        
        if (new_id.length() > 0) {
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        
        // 7
        if (new_id.length() <= 2) {
            while (new_id.length() < 3) {
                new_id += new_id.charAt(new_id.length() - 1);
            }
        }
        
        return new_id;
    }
}