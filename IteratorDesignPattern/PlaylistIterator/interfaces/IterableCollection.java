package IteratorDesignPattern.PlaylistIterator.interfaces;

public interface IterableCollection<T> {

    Iterator<T> createIterator();
}
