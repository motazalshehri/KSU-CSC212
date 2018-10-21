/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package problems_4_1;

import adt.queue.*;
import helpers.Helper;
import list.adt.*;

/**
 *
 * @author IT676
 */
public class Problem_4_1_6_Demo {

    public static void main(String[] args) {

        ArrayQueue<Queue<Integer>> queue = new ArrayQueue<>(5);

        ArrayQueue<Integer> queue1 = new ArrayQueue<>(3);
        ArrayQueue<Integer> queue2 = new ArrayQueue<>(3);
        ArrayQueue<Integer> queue3 = new ArrayQueue<>(3);

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);

        queue2.enqueue(4);
        queue2.enqueue(5);
        queue2.enqueue(6);

        queue3.enqueue(7);
        queue3.enqueue(8);
        queue3.enqueue(9);

        queue.enqueue(queue1);
        queue.enqueue(queue2);
        queue.enqueue(queue3);

        Queue<Integer> concatQueue = queue.concat2(queue);

        Helper.printQueue(concatQueue);

        System.out.println("Original Queue Length : " + queue.length());

        Helper.printQueue(queue.serve());
        Helper.printQueue(queue.serve());
        Helper.printQueue(queue.serve());
        
        System.out.println("Original Queue Length : " + queue.length());

    }
}
