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
public class Problem_4_1_7_Demo {

    public static void main(String[] args) {

        
        ArrayQueue<Integer> queue = new ArrayQueue<>(5);
       
        queue.enqueue(10);
        queue.enqueue(8);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(2);

       
        Helper.printQueue(queue);
        queue.removeElement(queue, 7);
        

        Helper.printQueue(queue);

    }
}
