class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            
            int temp = arr[a];
            System.out.println("temp : " + temp);
            arr[a] = arr[b];
            System.out.println("arr[a] : " + arr[a]);
            arr[b] = temp;
            System.out.println("arr[b] : " + arr[b]);
        }
        
        return answer;
    }
}