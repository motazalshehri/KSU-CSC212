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
public class Problem_4_1_2_Demo {

    public static void main(String[] args) {

        ArrayQueue<Integer> queue = new ArrayQueue<Integer>(5);

        List<Integer> list = new LinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        queue.enqueue(4);//0  h
        queue.enqueue(3);//1
        queue.enqueue(2);//2
        queue.enqueue(1);//3   t=4

        Helper.printQueue(queue);

        System.out.println(queue.isReverse(list));
        Helper.printQueue(queue);

    }
}
