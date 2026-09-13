package IteratorDesignPattern.PlaylistIterator.interfaces;

public interface Iterator<T> {
    
    boolean hasNext();

    T getNext();
}
