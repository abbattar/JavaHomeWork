package Home_Work_3;

import java.util.ArrayList;
import java.util.Arrays;

public class JHW3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> someList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            someList.add((int) (Math.random() * 100));
        }
        System.out.println(Arrays.toString(someList.toArray()));
        System.out.println(getMax(someList));
        System.out.println(getMin(someList));
        System.out.println(getMiddle(someList));
    }
    public static int getMax(ArrayList<Integer> someList){
        int maxValue = someList.get(0);
        for(int i = 1;i < someList.size();i++){ if(someList.get(i) > maxValue){
            maxValue = someList.get(i);
            }
        }
        return maxValue;
    }

    public static int getMin(ArrayList<Integer> someList){
        int minValue = someList.get(0);
        for(int i = 1; i<someList.size(); i++){
            if(someList.get(i) < minValue){
                minValue = someList.get(i);
            }
        }
        return minValue;
    }

    public static double getMiddle(ArrayList<Integer> someList) {
        int sum = 0;
        for (int i = 0; i < someList.size(); i++) {
            sum += someList.get(i);
        }
        double middleValue = sum / someList.size();
        return middleValue;
    }
}
