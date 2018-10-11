package adt;

import problems_3_2.Condition;
import problems_3_2.Processor;

public class LinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> current;

    public LinkedList() {
        head = current = null;
    }

    @Override
    public boolean empty() {
        return head == null;
    }

    @Override
    public boolean last() {
        return current.next == null;
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public void findFirst() {
        current = head;
    }

    @Override
    public void findNext() {
        current = current.next;
    }

    @Override
    public T retrieve() {
        return current.data;
    }

    @Override
    public void update(T val) {
        current.data = val;

    }

    @Override
    public void insert(T val) {
        Node<T> tmp;
        if (empty()) {
            current = head = new Node<T>(val);
        } else {
            tmp = current.next;
            current.next = new Node<T>(val);
            current = current.next;
            current.next = tmp;
        }
    }

    @Override
    public void remove() {
        if (current == head) {
            head = head.next;
        } else {
            Node<T> tmp = head;

            while (tmp.next != current) {
                tmp = tmp.next;
            }

            tmp.next = current.next;
        }

        if (current.next == null) {
            current = head;
        } else {
            current = current.next;
        }
    }

    /*
        Code for problem 3.2.1
     */
    public void filter(Condition<T> cnd) {

        if (empty()) {
            return;//cancel the operation
        }
        /*
          move the current pointer to first element
         */
        findFirst();

        /*
          loop through elements till the last one
         */
        while (current != null) {

            if (cnd.test(current.data) == false)//or use ( ! )
            {
                this.remove();//remove the element
            }

            findNext();//move the current pointer to the next element

        }

    }

    /*
        Code for problem 3.2.2
     */
    public void traverse(Processor<T> processor) {

        if (empty()) {
            return;//cancel the operation
        }

        /*
          move the current pointer to first element
         */
        findFirst();

        /*
        loop through elements till the last one
         */
        while (current != null) {

            /*
              call the method process on the element
             */
            processor.process(current.data);//
            findNext();//move the current pointer to the next element

        }

    }

    /*
        Code for problem 3.2.3
     */
    public void removeBetween(T e1, T e2) {
        /*
        check if the list is empty
         */
        if (head == null) {//same as empty() method
            return;//cancel the operation
        }

        /*
            Optional : 
           you can do the operation only when the list has at least 3 elements
           create a while loop and then cound the elements , if counter< 3  cancel the process
         
         */
 /*
          check for the elements if they're in the list or not.
          by default we assume no
         */
        boolean isE1Found, isE2Found;
        isE1Found = isE2Found = false;

        /*
         traverse the list 
         */
 /*
         to know from where to start the traversing and removing the elements
         we need a pointer 
         */
        Node startingPointer = null;//no need to wory about null value

        current = head; //same as findFirst() method
        while (current != null && (!isE1Found || !isE2Found)) {

            T currentElement = current.data;

            if (currentElement.equals(e1)) {
                isE1Found = true;
                startingPointer = current;

            } else if (currentElement.equals(e2)) {
                isE2Found = true;
            }

            current = current.next;//move to the next element
        }


        /*
         check  before doing the process if the two elements are found or not
          if (isE1Found && isE2Found)  or
         */
        if (!isE1Found || !isE2Found) {

            return;//cancel the process
        }

        /*
          1-reaching here means that , the two elements found in the list
            so do the logic and remove the elements btw them.
        
           2- from the given fact in the question that 
              e1 != e2   we can do the follwoing logic.
         */
        Node<T> temp;
        while (!(startingPointer.next.data.equals(e2))) {
            /*
                  temp is the node after the current node
             */
            temp = startingPointer.next;
            startingPointer.next = temp.next;
            temp.next = null;//optional

        }

        /*
           Important note :  this method will fail in case you
           passed an element in the first argument(e1) which comes after the 
           element in the second argument(e2).
           
           Discuss me in the class to tell you why and how to fix that.
        
           Here I will ignore this case to make the code simple for you and as 
           they want in the question.
          
         */
    }

    /*
        Code for problem 3.2.4 
     */
    public void insertBefore(T e, int i) {

        /*
            no need to validation , as the question stated 
            assume i is a valid index
         */
        current = head;

        if (i == 0) {

            head = new Node<T>(e);
            head.next = current;
            current = head;//move the current to new node : optional
        } else {

            int j = 0;
            while (j < i - 1) {

                current = current.next;
                j++;
            }

            Node<T> temp = current.next;//the node which becomes after the new node
            current.next = new Node<T>(e);//the new node
            current.next.next = temp;//link the new node to the 
            current = current.next;//move the current to new node : optional

        }
    }

    /*
        Code for problem 3.2.5.a 
     */
    public void insertBeforeCurrent(T e) {

        if (!full()) {

            if (current == head) {
                head = new Node<T>(e);
                head.next = current;//current now is the old head
                current = head;//update the current to become the new node 

            } else {

                /*
                traverse the list from the begining till before the current
                 */
                Node<T> temp = head;

                while (temp.next != current) {
                    temp = temp.next;
                }

                temp.next = new Node<T>(e);//create the new node and link it
                temp = temp.next; //temp now is the new node
                temp.next = current;//next for the new node
                current = temp;//update the current to become the new node

            }
        }

    }

    /*
        Code for problem 3.2.5.b
   
     */
    public void removeIth(int i) {

        /*
        check if the list is empty 
         */
        if (head == null) {
            return;//cancel the operation
        }

        /*
            assuming that  the i is valid 
            or you can do a while loop to validate it
         */
 /*
         if it's the first element to remove
         */
        if (i == 0) {

            current = head = head.next;

            if (head == null) {
                current = null;
            }

        } else {

            Node<T> temp;
            temp = current = head;

            int j = 0;
            while (j < i) {
                temp = current;
                current = current.next;
                j++;
            }

            temp.next = current.next;
            /*
                If successor of the deleted element
                exists it is made the new current element otherwise
                first element is made the new current element.
             */
            if (current.next != null) {
                current = current.next;
            } else {

                current = head;
            }

        }

    }

    /*
        Code for problem 3.2.6
   
     */
    public void removeOddElems() {
        /*
        check if the list is empty 
         */
        if (head == null) {
            return;//cancel the operation
        }
        /*
           0    1   2    3    4   5
           A    B   C    D    E   F
         */

        current = head;
        Node<T> temp;

        while (current != null) {

            temp = current.next;

            if (temp != null) {

                current.next = temp.next;

            }
            current = current.next;

            temp = null;//remove the reference from the removed element : Optional
        }

    }
}
