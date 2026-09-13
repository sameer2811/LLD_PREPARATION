package IteratorDesignPattern.NotificationIterator.iterators;

import java.util.List;
import java.util.ArrayList;
import IteratorDesignPattern.NotificationIterator.interfaces.NotificationIterator;
import IteratorDesignPattern.NotificationIterator.models.Notification;
import IteratorDesignPattern.NotificationIterator.service.NotificationCentre;

public class ReadNotificationIterator implements NotificationIterator<Notification> {
    int currentNotificationIndex = 0;
    private List<Notification> readNotifications;

    public ReadNotificationIterator(NotificationCentre notificationCentre) {
        this.readNotifications = new ArrayList<Notification>();
        for (Notification notification : notificationCentre.getNotifications()) {
            if (notification.isRead()) {
                this.readNotifications.add(notification);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return currentNotificationIndex < readNotifications.size();
    }

    @Override
    public Notification getNext() {
        Notification currentNotification = readNotifications.get(currentNotificationIndex);
        currentNotificationIndex = currentNotificationIndex + 1;
        return currentNotification;
    }
}
