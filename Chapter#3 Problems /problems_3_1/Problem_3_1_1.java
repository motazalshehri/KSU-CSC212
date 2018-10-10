/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package problems_3_1;

import adt.ArrayList;

/**
 *
 * @author IT676
 */
public class Problem_3_1_1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>(10);

        al.insert("A");

        al.insert("B");

        al.insert("C");

        al.insert("D");

    }

    /*
      if it is a LinkedList no need to do more changes on
      the implementation of the method
      just change theparameter to a LinkedList<T> insted of 
      ArrayList   ,  or   Make it List<T>  for to accept both without
      any more changes
     */
    public static <T> void clear(ArrayList<T> l) {

        /*
        move the current pointer to the first element
         */
        l.findFirst();

        /*
        while the list not empty  remove an item 
         */
        while (!l.empty()) {

            l.remove();

        }

    }

}
