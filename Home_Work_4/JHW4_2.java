package Home_Work_4;

// import java.util.ArrayDeque;
// import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
// import java.util.Scanner;

public class JHW4_2 {
  public static void main(String[] args) {
    Queue<Integer> que = new LinkedList<Integer>();
    // Queue<Integer> newQue = new LinkedList<Integer>();
    LinkedList<Integer> ll = new LinkedList<Integer>();
    for (int i = 0; i < 20; i++) {
      que.add(((int)(Math.random() * 20)));
    }
    System.out.println(que);
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Введите значение: ");
    // int i = sc.nextInt();
    // sc.close();
    // MyClass.enqueue(que, i);
    ll.addAll(que);
    System.out.println(ll);
    System.out.println(MyClass.first(ll));
    System.out.println(MyClass.dequeue(ll));
  }
  class MyClass {

    // public static Queue<Integer> enqueue(Queue<Integer> que, int i) {
    //   Queue<Integer> queTemp = new LinkedList<Integer>();
    //   Queue<Integer> queTempLast = new LinkedList<Integer>();
    //   Deque<Integer> dq = new ArrayDeque<Integer>();
    //   LinkedList<Integer> ll = new LinkedList<Integer>();
    //   LinkedList<Integer> invLl = new LinkedList<Integer>();
    //   queTemp.addAll(que);
    //   ll.addAll(que);
    //   invLl = invert(invLl);
    //   System.out.println(queTempLast);
    //   System.out.println(queTemp);
    //   queTempLast.addAll(invLl);
    //   Integer p = que.peek();
    //   for (int j = 0; j < queTemp.size(); j++) {
    //     dq.addFirst(queTemp.poll());
    //     dq.addLast(queTempLast.poll());
    //   }
    //   queTempLast.addAll(dq);
    //   return queTempLast;
    // }

    // Не успел

    private static LinkedList<Integer> invert(LinkedList<Integer> ll) {
      LinkedList<Integer> invLl = new LinkedList<>();
      for (int i = 0; i < ll.size(); i++)
        invLl.add(i, ll.get(ll.size() - i - 1));
      return invLl;
    }

    public static Integer dequeue(LinkedList<Integer> ll) {
      Integer i;
      i = ll.poll();
      return i;
    }
    public static Integer first(LinkedList<Integer> ll) {
      Integer i;
      i = ll.element();
      return i;
    }
  }
}
