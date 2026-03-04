// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.Iterator;

import java.util.NoSuchElementException;

public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<E> list;

    public MyDeque() {
        this.list = new LinkedList<>();
    }

    @Override
    public void enqueueFront(E element) {
        list.addFirst(element);
    }

    @Override
    public void enqueueBack(E element) {
        list.addLast(element);
    }

    @Override
    public E dequeueFront() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return list.removeFirst();
    }

    @Override
    public E dequeueBack() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return list.removeLast();
    }

    @Override
    public int size() {
        return list.size();
    }

    
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    public static void main(String[] args) {
        MyDeque<String> dq = new MyDeque<>();
        
        dq.enqueueBack("Middle");
        dq.enqueueFront("Start");
        dq.enqueueBack("End");

        // Testing the Iterator (which works because we overrode the default)
        for (String s : dq) {
            System.out.println(s); // Output: Start, Middle, End
        }
    }
}