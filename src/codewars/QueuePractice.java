package codewars;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> animal3 = new LinkedList<>();
        animal3.offer("Dog");
        animal3.add("Cow");
        animal3.add("Hen");
        animal3.add("Cock");

        animal3.poll();
        System.out.println(animal3.peek());
        System.out.println("--------------------------");
        animal3.remove();

        Iterator itr = animal3.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
