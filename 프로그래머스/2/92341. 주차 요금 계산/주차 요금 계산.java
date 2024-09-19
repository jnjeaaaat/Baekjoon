import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Set<String> set = new HashSet<>();
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < records.length; i++) {
            String[] temp = records[i].split(" ");
            String time[] = temp[0].split(":");
            int curTime = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            
            if (set.contains(temp[1])) {
                
                for (Car car : list) {
                    if (car.num.equals(temp[1])) {
                        
                        if (temp[2].equals("OUT")) {
                            car.totalTime += (curTime - car.curTime);
                            car.isOut = true;
                        } else {
                            car.isOut = false;
                            car.curTime = curTime;
                        }
                        
                        break;
                    }
                }
            } else {
                set.add(temp[1]);
                
                list.add(new Car(temp[1], curTime));
            }
        }
        
        for (Car car : list) {
            if (!car.isOut) {
                car.totalTime += (23 * 60 + 59) - car.curTime;
                car.isOut = true;
            }
        }
        
        int[] result = new int[set.size()];
        Collections.sort(list);
        for (int i = 0; i < result.length; i++) {
            
            if (list.get(i).totalTime > fees[0]) {
                result[i] = fees[1] + ((int) Math.ceil((double) (list.get(i).totalTime - fees[0]) / (double) fees[2]) * fees[3]);
            } else {
                result[i] = fees[1];
            }
            
        }
        
        return result;
    }
}

class Car implements Comparable<Car> {
    String num;
    int curTime;
    int totalTime = 0;
    boolean isOut = false;
    
    Car(String num, int curTime) {
        this.num = num;
        this.curTime = curTime;
    }
    
    public int compareTo(Car o) {
        return num.compareTo(o.num);
    }
}