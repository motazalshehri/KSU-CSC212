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
public class Problem_3_2_5_B_Demo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.insert("A");
        list.insert("B");
        list.insert("C");
        list.insert("D");
        list.insert("E");

        Helper.printList(list);

        list.removeIth(0);

        System.out.println(list.retrieve());

        System.out.println("******** removeIth(i) ******");

        Helper.printList(list);

    }

}
