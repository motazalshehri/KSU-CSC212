/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package list;

/**
 *
 * @author IT676
 */
public class Problem_3_5 {

    public static void main(String[] args) {
        //List<String> list = new ArrayList<String>(10);
        //or
        List<Integer> list = new LinkedList<Integer>();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(2);
        list.insert(5);
        list.insert(3);

        System.out.println(mfe(list));

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

        int currentMoveCounter = 0;

        counter++;//for the last
        int frequency = 0;
        T mostFrquentElement = null;
        int max = 0;

        l.findFirst();
        for (int i = 0; i < counter;) {

            T item = l.retrieve();
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
            }

            mostFrquentElement = item;
            i++;
            l.findFirst();
            while (currentMoveCounter < i) {
                l.findNext();
                currentMoveCounter++;
            }

        }

        return mostFrquentElement;
    }

}
