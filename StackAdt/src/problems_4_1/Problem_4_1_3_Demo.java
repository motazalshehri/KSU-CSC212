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
public class Problem_4_1_3_Demo {

    public static void main(String[] args) {

        ArrayQueue<Integer> queue1 = new ArrayQueue<Integer>(5);
        ArrayQueue<Integer> queue2 = new ArrayQueue<Integer>(5);

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(48);

        queue2.enqueue(4);
        queue2.enqueue(3);
        queue2.enqueue(2);
        queue2.enqueue(1);

        Helper.printQueue(queue1);
        Helper.printQueue(queue2);

        System.out.println(queue1.isReverse(queue1, queue2));
        
        
        Helper.printQueue(queue1);
        Helper.printQueue(queue2);
    }
}
