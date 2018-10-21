/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package helpers;

import DLL.adt.DoubleLinkedList;
import adt.queue.Queue;
import list.adt.List;

/**
 *
 * @author IT676
 */
public class Helper {

    public static <T> void printDoubleLinkedList(DoubleLinkedList<T> list) {

        if (list.empty()) {
            System.out.println("list is empty !");
            return;
        }
        list.findFirst();

        while (!list.last()) {
            
            System.out.print(list.retrieve() + " , ");
            list.findNext();
        }
        System.out.println(list.retrieve());//for the last element
        System.out.println();
    }
    
      public static <T> void printList(List<T> list) {

        if (list.empty()) {
            System.out.println("list is empty !");
            return;
        }
        list.findFirst();

        while (!list.last()) {
            
            System.out.print(list.retrieve() + " , ");
            list.findNext();
        }
        System.out.println(list.retrieve());//for the last element
        System.out.println();
    }

    public static <T> void printQueue(Queue<T> q) {

        if (q.length() == 0) {
            System.out.println("queue is empty !");
            return;
        }

        int counter = q.length();

        for (int i = 0; i < counter ; i++) {

            T item = q.serve();
            System.out.print(item + " , ");
            q.enqueue(item);
        }

        System.out.println();
    }
    
    
    
}
