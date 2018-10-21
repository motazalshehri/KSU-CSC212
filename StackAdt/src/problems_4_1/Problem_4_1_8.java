/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package problems_4_1;

import adt.queue.*;
import helpers.Helper;
import list.adt.*;

/**
 *
 * @author IT676
 */
public class Problem_4_1_8 {

    public static void main(String[] args) {

        ArrayQueue<Character> queue = new ArrayQueue<>(8);

        queue.enqueue('A');//0
        queue.enqueue('B');//1
        queue.enqueue('C');//2
        queue.enqueue('D');//3
        queue.enqueue('E');//4
        queue.enqueue('F');//5
        queue.enqueue('G');//6
        queue.enqueue('H');//7

        int[] pos = {1, 2, 4, 5};
        int k = pos.length;
        Helper.printQueue(queue);
        remove(queue, pos, k);
        Helper.printQueue(queue);

    }

    public static <T> void remove(Queue<T> q, int[] pos, int k) {

        if (q.length() == 0) {
            return;
        }

        int size = q.length();
        int posCounter = 0;
        int posIndex = 0;

        for (int i = 0; i < size; i++) {

            T item = q.serve();
            if (posIndex == k) {
                q.enqueue(item);
            } else if (posCounter != pos[posIndex]) {
                q.enqueue(item);

            } else {

                posIndex++;
            }
            posCounter++;
        }
    }
}
