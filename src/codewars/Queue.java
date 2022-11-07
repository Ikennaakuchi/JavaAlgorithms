package codewars;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("John");
        queue.add("Sam");
        queue.add("Mark");
        queue.add("Orli");


        queue.poll();
        queue.remove();
        queue.poll();

        Iterator<String> itr = queue.iterator();
          while (itr.hasNext()){
              System.out.println(itr.next());
        }
    }
}
