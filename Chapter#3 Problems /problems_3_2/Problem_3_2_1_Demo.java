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
public class Problem_3_2_1_Demo {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.insert(1);
        list.insert(4);
        list.insert(3);
        list.insert(8);
        list.insert(5);
        list.insert(2);
        list.insert(7);

        System.out.println("List elements : ");
        Helper.printList(list);

        System.out.println("Filter Elements.....");
        list.filter(new LessThanFive());

        Helper.printList(list);

    }

}

/*
   Concrete class Just for Demo
 */
class LessThanFive implements Condition<Integer> {

    @Override
    public boolean test(Integer data) {

        return (data < 5);

    }

}
