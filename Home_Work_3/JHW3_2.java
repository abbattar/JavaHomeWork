package Home_Work_3;

import java.util.ArrayList;
import java.util.Arrays;

public class JHW3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> someList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
          someList.add((int) (Math.random() * 100));
        }
        for (int i = 0; i < someList.size(); i++) someList.get(i);

        System.out.println(Arrays.toString(someList.toArray()));

        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i)%2 == 0) {
                someList.remove(i);
                i--;
            }
        }
        for (int i = 0; i < someList.size(); i++) someList.get(i);

        System.out.println(Arrays.toString(someList.toArray()));
    }
}
