/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package problems_4_1;

import DLL.adt.DoubleLinkedList;
import adt.queue.ArrayQueue;
import adt.queue.Queue;
import helpers.Helper;

/**
 *
 * @author IT676
 */
public class Problem_4_1_1 {

    public static void main(String[] args) {

        DoubleLinkedList<Integer> list = new DoubleLinkedList<Integer>();
        Queue<Integer> queue = new ArrayQueue<Integer>(4);

        list.insert(1);
        list.insert(2);
        list.insert(4);
        list.insert(3);

        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        System.out.println("List : ");
        Helper.printDoubleLinkedList(list);

        System.out.println("Queue : ");
        Helper.printQueue(queue);

        System.out.println("\n---isReverse(list, queue)---");

        System.out.println("isReverse ? " + isReverse(list, queue));

        System.out.println("List : ");
        Helper.printDoubleLinkedList(list);

        System.out.println("Queue : ");
        Helper.printQueue(queue);

    }

    public static <T> boolean isReverse(DoubleLinkedList<T> l, Queue<T> q) {

        /*
          check if the list or queue is empty
         */
        if (l.empty() || q.length() == 0) {
            return false;
        }

        l.findFirst();
        int size = 0;
        while (!l.last()) {
            size++;
            l.findNext();
        }
        size++; //for the last element

        
        
        
        if (size != q.length()) {
            return false;
        }

        while (!l.first()) {

            T item = q.serve();
            if (!(l.retrieve().equals(item))) {

                return false;
            }
            q.enqueue(item);

            l.findPrevious();

        }

        T item = q.serve();
        if (!(l.retrieve().equals(item))) {

            return false;
        }
        q.enqueue(item);

      

        return true;

    }
}
