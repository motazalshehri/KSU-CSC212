/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package problems_3_1;

import adt.LinkedList;
import adt.List;

/**
 *
 * @author IT676
 */
public class Problem_3_1_5 {

    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<Integer>(10);
        //or
        List<Integer> list = new LinkedList<Integer>();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(2);
        list.insert(5);
        list.insert(3);

        System.out.println("The Most Frequent Element is : " + mfe(list));

    }

    public static <T> T mfe(List<T> l) {

        /*
           1    2    3    4   2  5  3
         */
        l.findFirst();
        int counter = 0;
        while (!l.last()) {
            l.findNext();
            counter++;
        }

        counter++;//for the last item
        int frequency = 0;
        T mostFrquentElement = null;
        int max = 0;
        int currentMoveCounter = 0;
        l.findFirst();

        for (int i = 0; i < counter;) {

            T item = l.retrieve();
            /*
              To show Which element is being testing , print it
              --> for testing only
             */
            System.out.println("Current Element Testing : " + item); //demo

            while (!l.last()) {

                if (item.equals(l.retrieve())) {
                    frequency++;
                }
                l.findNext();
            }

            if (item.equals(l.retrieve())) {
                frequency++;
            }

            if (frequency > max) {
                max = frequency;

                mostFrquentElement = item;

            }

            frequency = 0;//reset

            i++;
            l.findFirst();

            while (currentMoveCounter < i) {
                l.findNext();

                currentMoveCounter++;
            }
            currentMoveCounter = 0;//reset the moves counter 

        }

        /*
         To show The Max Frequent Times then print  max
         --> for testing only
         */
        System.out.println("Max Frequent Times: " + max + "  by the Item : " + mostFrquentElement); //demo

        return mostFrquentElement;
    }

}
