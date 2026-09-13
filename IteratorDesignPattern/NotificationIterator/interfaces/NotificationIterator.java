package IteratorDesignPattern.NotificationIterator.interfaces;

public interface NotificationIterator<T> {

    boolean hasNext();

    T getNext();
}
