/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package helpers;

import adt.List;

/**
 *
 * @author IT676
 */
public class Helper {

    public static <T> void printList(List<T> list) {

        list.findFirst();

        while (!list.last()) {
            T item = list.retrieve();
            System.out.print(item + " , ");
            list.findNext();

        }
        System.out.println(list.retrieve());//for the last element
        System.out.println("");
    }

}
