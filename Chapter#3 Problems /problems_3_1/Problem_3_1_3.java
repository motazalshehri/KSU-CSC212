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
public class Problem_3_1_3 {

    public static void main(String[] args) {

        List<String> list1 = new LinkedList<String>();

        List<String> list2 = new LinkedList<String>();
        List<String> commonList = new LinkedList<String>();

        list1.insert("A");
        list1.insert("B");
        list1.insert("C");
        list1.insert("F");
        list1.insert("M");
        list1.insert("D");

        Helper.printList(list1);
        list2.insert("R");
        list2.insert("M");
        list2.insert("W");
        list2.insert("F");
        Helper.printList(list2);

        System.out.println("******************************");
        commonE(list1, list2, commonList);
        Helper.printList(commonList);
    }

    public static <T> void commonE(List<T> l1, List<T> l2, List<T> cl) {
        /*
               A    B    C  F  M  D
               R    M    W  F
        
         */
        l1.findFirst();
        while (!l1.last()) {
            T item1 = l1.retrieve();

            l2.findFirst();
            while (!l2.last()) {

                T item2 = l2.retrieve();

                if (item1.equals(item2)) {

                    cl.insert(item1);//or item 2
                }
                l2.findNext();
            }

            if (item1.equals(l2.retrieve())) {

                cl.insert(item1);//or item 2
            }

            l1.findNext();
        }
        l2.findFirst();
        T item1 = l1.retrieve();
        while (!l2.last()) {

            T item2 = l2.retrieve();
            if (item1.equals(item2)) {

                cl.insert(item2);//or item 1
            }
            l2.findNext();
        }

    }

}
