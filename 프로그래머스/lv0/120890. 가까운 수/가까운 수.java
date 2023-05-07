import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        if (array[0] >= n) {
            return array[0];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= n) {
                int before = n - array[i - 1];
                int after = array[i] - n;
                return before <= after ? array[i - 1] : array[i];
            }
        }
        return array[array.length - 1];
    }
}