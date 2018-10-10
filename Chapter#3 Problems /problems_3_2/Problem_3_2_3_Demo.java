/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package problems_3_2;

import adt.LinkedList;
import helpers.Helper;

/**
 *
 * @author IT676
 */
public class Problem_3_2_3_Demo {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<String>();

        list1.insert("a");
        list1.insert("c");
        list1.insert("d");
        list1.insert("b");
        list1.insert("r");
        list1.insert("x");

        Helper.printList(list1);

        list1.removeBetween("c", "r");
        System.out.println("************************");

        Helper.printList(list1);

    }

 
}
