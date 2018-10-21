package adt.queue;

import adt.stack.*;
import list.adt.LinkedList;
import list.adt.List;

public class ArrayQueue<T> implements Queue<T> {

    private int maxsize;
    private int size;
    private int head, tail;
    private T[] nodes;

    /**
     * Creates a new instance of ArrayQueue
     *
     * @param n
     */
    public ArrayQueue(int n) {
        maxsize = n;
        size = 0;
        head = tail = 0;
        nodes = (T[]) new Object[n];

    }

    @Override
    public boolean full() {
        return size == maxsize;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public void enqueue(T e) {

        nodes[tail] = e;
        tail = (tail + 1) % maxsize;
        size++;

    }

    @Override
    public T serve() {
        T e = nodes[head];
        head = (head + 1) % maxsize;
        size--;
        return e;
    }

    /*
       problem  4.2.2
     */
    public boolean isReverse(List<T> l) {

        boolean isReverse = true;

        /*
           check if the list is empty of queue is empty 
         */
        if (l.empty() || size == 0) {
            return false;
        }

        l.findFirst();
        int listSize = 0;

        while (!l.last()) {

            listSize++;
            l.findNext();
        }
        listSize++;

        if (listSize != size) {
            return false;
        }
        
        
        l.findFirst();

        int oldTail = tail;
        while (!l.last()) {
            if (tail == 0) {
                tail += size;
            } else {
                tail = tail - 1 % maxsize;
            }

            T item = nodes[tail];

            if (!item.equals(l.retrieve())) {
                isReverse = false;
            }     
            System.out.println("tail: " + tail + ", item: " + item);
            l.findNext();
        }

        if (tail == 0) {
            tail += size;
        } else {
            tail = tail - 1 % maxsize;
        }

        T item = nodes[tail];

        if (!item.equals(l.retrieve())) {
            isReverse = false;
        }
          System.out.println("tail: " + tail + ", item: " + item);

        tail = oldTail;

        return isReverse;
    }
    
      /*
       problem  4.2.3
     */
    
   public <T> boolean isReverse(Queue<T> q1, Queue<T> q2){
   
       if(q1.length() == 0 ||  q2.length() ==0)
           return false;
       
       if(q1.length() != q2.length())
           return false;
       
       
    Stack<T> stack = new LinkedStack();
     boolean isReverse = true;
    int counter = q2.length();
    
       for (int i = 0; i < counter; i++) {
           
           T item = q2.serve();
           stack.push(item);
           q2.enqueue(item);
       }
    
       while (!stack.empty()) {
           
           T item  = q1.serve();
           q1.enqueue(item);

           if(!(item.equals(stack.pop())))
               isReverse= false;
           
       }

       return isReverse;
}
    /*
       problem  4.2.4
     */
   public <T> void exchange(Queue<T> q1, Queue<T> q2){
        
       if(q1.length() != q2.length())
           return ;
       
      int counter = q1.length();
      
       for (int i = 0; i < counter; i++) {
           
          
           q1.enqueue(q2.serve());
           q2.enqueue(q1.serve());
       }
      
    }
   
   
   /*
   
      problem  4.2.5
   */
   
   public<T> List <T> concat(Queue<List<T>> q) {
       
       if(q.length() == 0)
           return null;
       
       List<T>  list = new LinkedList<>();
       
       int counter = q.length();
       
       for (int i = 0; i < counter; i++) {
           
          List<T> tempList = q.serve();
          q.enqueue(tempList);
          
          tempList.findFirst();
           while (!tempList.last()) {
               
               list.insert(tempList.retrieve());
               tempList.findNext();
           }
           list.insert(tempList.retrieve());
       }
       
       return list;
       
   }   
   /*
       problem  4.2.6
     */
    public <T> Queue<T> concat2(Queue<Queue<T>> q){
        
        if(q.length() == 0)
            return null;
        
        int counter = q.length();
        
        Queue<T> queue = new LinkedQueue<>();
        
        for (int i = 0; i < counter; i++) {

            Queue<T> tempQueue = q.serve();
            
            int tempCounter = tempQueue.length();
            
             for (int j = 0; j < tempCounter; j++) {
                
                T item = tempQueue.serve();
                tempQueue.enqueue(item);
                queue.enqueue(item);
            }
             q.enqueue(tempQueue);
            
            
        }
       
        return queue;
    }
    
    /*
       problem  4.2.7
     */
    public void removeElement(Queue <T> q, T e){
        
        
        if(q.length() == 0)
            return ;
        
        int counter = q.length();
        
        for (int i = 0; i < counter; i++) {
            
            T item = q.serve();
            
            if(!(item.equals(e)))
                q.enqueue(item);
        }
        
    }
    
    /*
       problem  4.2.7
     */
    
    
}