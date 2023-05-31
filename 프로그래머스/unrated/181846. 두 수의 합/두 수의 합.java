import java.util.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        StringBuilder aBuilder = new StringBuilder(a);
        StringBuilder bBuilder = new StringBuilder(b);

        String[] aS = aBuilder.reverse().toString().split("");
        String[] bS = bBuilder.reverse().toString().split("");
        int[] aNum = new int[aS.length];
        int[] bNum = new int[bS.length];
        int remain = 0;

        for (int i = 0; i < aNum.length; i++) {
            aNum[i] = Integer.parseInt(aS[i]);
        }

        for (int i = 0; i < bNum.length; i++) {
            bNum[i] = Integer.parseInt(bS[i]);
        }

        aNum = Arrays.copyOf(aNum, Math.max(aNum.length, bNum.length));
        bNum = Arrays.copyOf(bNum, Math.max(aNum.length, bNum.length));

        for (int i = 0; i < aNum.length; i++) {
            answer += (aNum[i] + bNum[i] + remain) % 10;
            remain = (aNum[i] + bNum[i] + remain) / 10;
        }

        if (remain > 0) {
            answer += remain;
        }

        StringBuilder S = new StringBuilder(answer);

        return S.reverse().toString();
    }
}