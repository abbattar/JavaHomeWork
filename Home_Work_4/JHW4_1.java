package Home_Work_4;

import java.util.LinkedList;

public class JHW4_1 {
    public static void main(String[]args){
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(((int)(Math.random() * 20)));
        }
        System.out.println(ll);
        System.out.println(invert(ll));
    }
    public static LinkedList<Integer> invert(LinkedList<Integer> ll) {
        LinkedList<Integer> invLl = new LinkedList<>();
        for (int i = 0; i < ll.size(); i++) invLl.add(i, ll.get(ll.size() - i - 1));
        return invLl;
    }
}