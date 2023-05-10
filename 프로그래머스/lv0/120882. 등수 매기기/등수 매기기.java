import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Double[] ranking = new Double[score.length];
        double[] average = new double[score.length];

        for (int i = 0; i < ranking.length; i++) {
            ranking[i] = (double) (score[i][0] + score[i][1]) / 2;
            average[i] = (double) (score[i][0] + score[i][1]) / 2;
        }

        Arrays.sort(ranking, Comparator.reverseOrder());
        System.out.println(Arrays.toString(ranking));

        for (int i = 0; i < ranking.length; i++) {
            for (int j = ranking.length - 1; j >= 0; j--) {
                if (average[i] == ranking[j]) {
                    answer[i] = j+1;
                }
            }
        }

        return answer;
        
//         int[] answer = new int[score.length];
//         List<Integer> avg = new ArrayList<>();
//         for (int i = 0; i < score.length; i++) {
//             avg.add(score[i][0] + score[i][1]);
//         }

//         avg.sort(Comparator.reverseOrder());

//         for (int i = 0; i < avg.size(); i++) {
//             answer[i] = avg.indexOf(score[i][0] + score[i][1]) + 1;
//         }
//         return answer;
    }
}