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
public class Problem_4_1_5_Demo {

    public static void main(String[] args) {

        ArrayQueue<List<Integer>> queue = new ArrayQueue<>(5);

        List<Integer> list1 = new LinkedList<>();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        

        List<Integer> list2 = new LinkedList<>();
        list2.insert(4);
        list2.insert(5);
        list2.insert(6);
        
        List<Integer> list3 = new LinkedList<>();
        list3.insert(7);
        list3.insert(8);
        list3.insert(9);
       
        
        queue.enqueue(list1);
        queue.enqueue(list2);
        queue.enqueue(list3);

        List<Integer>  concatList  =  queue.concat(queue);
        
        Helper.printList(concatList);
        
      
    }
}
