package IteratorDesignPattern.NotificationIterator.iterators;

import IteratorDesignPattern.NotificationIterator.interfaces.NotificationIterator;
import IteratorDesignPattern.NotificationIterator.models.Notification;
import IteratorDesignPattern.NotificationIterator.service.NotificationCentre;

public class AllNotificationIterator implements NotificationIterator<Notification> {

    int currentNotificationIndex = 0;
    private final NotificationCentre notificationCentre;

    public AllNotificationIterator(NotificationCentre notificationCentre) {
        this.notificationCentre = notificationCentre;
    }

    @Override
    public boolean hasNext() {
        return currentNotificationIndex < notificationCentre.getNotificationsSize();
    }

    @Override
    public Notification getNext() {
        Notification currentNotification = notificationCentre.getNotification(currentNotificationIndex);
        currentNotificationIndex = currentNotificationIndex + 1;
        return currentNotification;
    }
}
