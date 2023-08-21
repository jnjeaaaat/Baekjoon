import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        LinkedList<Integer> list = new LinkedList<>();
        
        for (int i : numbers) {
            list.add(i);
        }
        
        System.out.println(list);
        switch (direction) {
            case "right" :
                // int right = numbers[answer.length-1];
                // for (int i = answer.length-1; i >= 1; i--) {
                //     answer[i] = numbers[i-1];
                // }
                // answer[0] = right;
                list.offerFirst(list.pollLast());
                break;
            case "left" :
                // int left = numbers[0];
                // for (int i = 1; i < answer.length; i++) {
                //     answer[i-1] = numbers[i];
                // }
                // answer[answer.length-1] = left;
                list.offerLast(list.poll());
                break;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}