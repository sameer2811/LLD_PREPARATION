package IteratorDesignPattern.NotificationIterator.interfaces;

public interface NotificationIterableCollection<T> {

    NotificationIterator<T> getAllNotificationsIterator();

    NotificationIterator<T> getUnreadNotificationsIterator();

    NotificationIterator<T> getReadNotificationsIterator();

}
