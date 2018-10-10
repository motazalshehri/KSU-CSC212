/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package problems_3_1;

import adt.LinkedList;
import adt.List;
import helpers.Helper;

/**
 *
 * @author IT676
 */
public class Problem_3_1_4 {

    public static void main(String[] args) {
        //List<String> list = new ArrayList<String>(10);
        //or
        List<String> list = new LinkedList<String>();

        list.insert("a");
        list.insert("c");
        list.insert("d");
        list.insert("b");
        list.insert("r");
        list.insert("x");
        Helper.printList(list);

        moveToEnd(list, 2);
        System.out.println("****************");
        Helper.printList(list);
    }

    public static <T> void moveToEnd(List<T> l, int i) {

        /*
           set the current pointer to the  position
           in the list  
         */
        l.findFirst();//pos : 0

        /*
           move the current pointer the the position i in the list
         */
        int j = 0;
        while (j < i) {

            l.findNext();
            j++;
        }

        T tempItem = l.retrieve();//store the item before removing
        l.remove();//remove the node

        //move the pointer to the last position
        while (!l.last()) {
            l.findNext();
        }

        l.insert(tempItem);//insert the item at the last 

    }
}
