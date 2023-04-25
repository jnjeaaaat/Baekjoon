class Solution {
    public String solution(String letter) {
        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};
        String[] temp = letter.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (temp[i].equals(morse[j])) {
                    stringBuilder.append(alpha[j]);
                }
            }
        }
        return stringBuilder.toString();
    }
}