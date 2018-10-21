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
public class Problem_4_1_4_Demo {

    public static void main(String[] args) {

        ArrayQueue<Integer> queue1 = new ArrayQueue<Integer>(5);
        ArrayQueue<Integer> queue2 = new ArrayQueue<Integer>(5);

        queue1.enqueue(8);
        queue1.enqueue(6);
        queue1.enqueue(4);


        queue2.enqueue(5);
        queue2.enqueue(7);
        queue2.enqueue(9);
    

        Helper.printQueue(queue1);
        Helper.printQueue(queue2);

         queue1.exchange(queue1, queue2);
        
        System.out.println("");
        Helper.printQueue(queue1);
        Helper.printQueue(queue2);
    }
}
