/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package list;

/**
 *
 * @author IT676
 */
public class Problem_3_2 {

    public static void main(String[] args) {
        List<String> list1 = new LinkedList<String>();

        List<String> list2 = new LinkedList<String>();

        list1.insert("A");
        list1.insert("B");
        list1.insert("C");
        list1.insert("D");

        printList(list1);
        list2.insert("X");
        list2.insert("Z");
        printList(list2);

        System.out.println("*************************");

        insertAll(list1, list2, 1);
        printList(list1);
        System.out.println("*************************");
        printList(list2);
    }

    public static <T> void insertAll(List<T> l1, List<T> l2, int i) {

        if (l2.empty()) {
            return;
        }

        /*
          set the current pointer to the first position
           in list 1 
         */
        l1.findFirst();//pos : 0

        /*
        move the current pointer the the position i in the first list
         */
        int j = 0;
        while (j < i) {

            l1.findNext();
            j++;
        }

        /*
        set the current to the first pos  in second list
         */
        l2.findFirst();

        /*
        loop throght the elements  till last one
         */
        while (!l2.last()) {

            T item = l2.retrieve();//retrieve the element 
            l1.insert(item);//insert the element to list1
            l2.findNext();//move pointer to next element
        }

        //do same process for the last item 
        l1.insert(l2.retrieve());
    }

    /*
    This method for demonstation only to test the other methods
     */
    private static <T> void printList(List<T> list) {

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
