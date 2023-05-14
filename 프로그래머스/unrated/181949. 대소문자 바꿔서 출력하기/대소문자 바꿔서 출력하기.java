import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.next();
//         String[] aStr = a.split("");
//         String b = "";

//         for (int i = 0; i < aStr.length; i++) {
//             if (Character.isLowerCase(aStr[i].charAt(0))) {
//                 b += aStr[i].toUpperCase();
//             } else if (Character.isUpperCase(aStr[i].charAt(0))) {
//                 b += aStr[i].toLowerCase();
//             }
//         }
//         System.out.println(b);
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for (Character ch : a.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                answer += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                answer += Character.toUpperCase(ch);
            }
        }
        
        System.out.println(answer);
    }
}