package IteratorDesignPattern.NotificationIterator.service;

import java.util.List;
import java.util.ArrayList;
import IteratorDesignPattern.NotificationIterator.interfaces.NotificationIterableCollection;
import IteratorDesignPattern.NotificationIterator.interfaces.NotificationIterator;
import IteratorDesignPattern.NotificationIterator.models.Notification;
import IteratorDesignPattern.NotificationIterator.iterators.AllNotificationIterator;
import IteratorDesignPattern.NotificationIterator.iterators.UnreadNotificationIterator;
import IteratorDesignPattern.NotificationIterator.iterators.ReadNotificationIterator;

public class NotificationCentre implements NotificationIterableCollection<Notification> {

    private List<Notification> notifications;

    public NotificationCentre() {
        this.notifications = new ArrayList<>();
    }
    
    
    public void addNotification(Notification notification) {
        this.notifications.add(notification);
    }

    public List<Notification> getNotifications() {
        return this.notifications;
    }

    public Notification getNotification(int index) {
        return this.notifications.get(index);
    }

    public int getNotificationsSize() {
        return this.notifications.size();
    }

    @Override
    public NotificationIterator<Notification> getAllNotificationsIterator() {
        return new AllNotificationIterator(this);
    }

    @Override
    public NotificationIterator<Notification> getUnreadNotificationsIterator() {
        return new UnreadNotificationIterator(this);
    }

    @Override
    public NotificationIterator<Notification> getReadNotificationsIterator() {
        return new ReadNotificationIterator(this);
    }
}
