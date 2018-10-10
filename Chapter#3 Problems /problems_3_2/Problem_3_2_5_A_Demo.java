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
public class Problem_3_2_5_A_Demo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.insert("A");
        list.insert("B");
        list.insert("C");
        list.insert("D");
        list.insert("E");

        Helper.printList(list);

        /*
        try using :
                     list.findFirst();
                     list.findNext(); 
        to see more cases when the current changes 
        before making the call to the method
         */
        
        
        
        list.insertBeforeCurrent("X");

        System.out.println("******** insertBeforeCurrent(X) ******");

        Helper.printList(list);

    }

}
