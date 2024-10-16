class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] dog = new int[2];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    dog[0] = i;
                    dog[1] = j;
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            char op = route[0].charAt(0);
            int n = Integer.parseInt(route[1]);
            boolean flag = false;
            
            if (op == 'E') {
                for (int j = 0; j < n; j++) {
                    if (dog[1] + (j + 1) >= park[dog[0]].length() ||
                        park[dog[0]].charAt(dog[1] + (j + 1)) == 'X') {
                        flag = true;
                    }
                }
                
                if (!flag) {
                    dog[1] += n;
                }
                
            } else if (op == 'W') {
                for (int j = 0; j < n; j++) {
                    if (dog[1] - (j + 1) < 0 ||
                        park[dog[0]].charAt(dog[1] - (j + 1)) == 'X') {
                        flag = true;
                    }
                }
                
                if (!flag) {
                    dog[1] -= n;
                }
                
            } else if (op == 'S') {
                for (int j = 0; j < n; j++) {
                    if (dog[0] + (j + 1) >= park.length ||
                        park[dog[0] + (j + 1)].charAt(dog[1]) == 'X') {
                        flag = true;
                    }
                }
                
                if (!flag) {
                    dog[0] += n;
                }
                
            } else if (op == 'N') {
                for (int j = 0; j < n; j++) {
                    if (dog[0] - (j + 1) < 0 ||
                        park[dog[0] - (j + 1)].charAt(dog[1]) == 'X') {
                        flag = true;
                    }
                }
                
                if (!flag) {
                    dog[0] -= n;
                }
                
            }
        }
        
        return dog;
    }
}