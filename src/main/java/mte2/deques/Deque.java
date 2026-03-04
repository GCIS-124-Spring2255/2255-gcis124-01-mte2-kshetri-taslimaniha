// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: Deque.java

package mte2.deques;



import java.util.Iterator;

public interface Deque<E> extends Iterable<E> {
    
    void enqueueFront(E element);
    void enqueueBack(E element);
    
    E dequeueFront();
    E dequeueBack();
    
    int size();


    @Override
    default Iterator<E> iterator() {
        throw new UnsupportedOperationException("Iterator not implemented yet.");
    }
}