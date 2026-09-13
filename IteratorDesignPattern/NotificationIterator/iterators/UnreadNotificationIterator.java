package IteratorDesignPattern.NotificationIterator.iterators;

import IteratorDesignPattern.NotificationIterator.interfaces.NotificationIterator;
import IteratorDesignPattern.NotificationIterator.models.Notification;
import IteratorDesignPattern.NotificationIterator.service.NotificationCentre;
import java.util.List;
import java.util.ArrayList;

public class UnreadNotificationIterator implements NotificationIterator<Notification> {

    int currentNotificationIndex = 0;
    private List<Notification> unreadNotifications;

    public UnreadNotificationIterator(NotificationCentre notificationCentre) {
        this.unreadNotifications = new ArrayList<Notification>();
        for (Notification notification : notificationCentre.getNotifications()) {
            if (!notification.isRead()) {
                this.unreadNotifications.add(notification);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return currentNotificationIndex < unreadNotifications.size();
    }

    @Override
    public Notification getNext() {
        Notification currentNotification = unreadNotifications.get(currentNotificationIndex);
        currentNotificationIndex = currentNotificationIndex + 1;
        return currentNotification;
    }
}
