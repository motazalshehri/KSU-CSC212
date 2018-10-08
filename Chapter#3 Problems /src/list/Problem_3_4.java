/*
 * Written By NAIF ALSHEHRI
 * https://VisionAcademy.online
 */
package list;

/**
 *
 * @author IT676
 */
public class Problem_3_4 {

    public static void main(String[] args) {
        //List<String> list = new ArrayList<String>(10);
        //or
        List<String> list = new LinkedList<String>();

        list.insert("a");
        list.insert("c");
        list.insert("d");
        list.insert("b");
        list.insert("r");
        list.insert("x");
        printList(list);

        moveToEnd(list, 2);
        System.out.println("****************");
        printList(list);
    }

    public static <T> void moveToEnd(List<T> l, int i) {

        /*
           set the current pointer to the  position
           in the list  
         */
        l.findFirst();//pos : 0

        /*
           move the current pointer the the position i in the list
         */
        int j = 0;
        while (j < i) {

            l.findNext();
            j++;
        }

        T tempItem = l.retrieve();//store the item before removing
        l.remove();//remove the node

        //move the pointer to the last position
        while (!l.last()) {
            l.findNext();
        }

        l.insert(tempItem);//insert the item at the last 

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
        System.out.println(list.retrieve());
        System.out.println("");
    }
}
