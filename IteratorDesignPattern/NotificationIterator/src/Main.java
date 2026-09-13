package IteratorDesignPattern.NotificationIterator.src;

import IteratorDesignPattern.NotificationIterator.models.Notification;
import IteratorDesignPattern.NotificationIterator.service.NotificationCentre;
import IteratorDesignPattern.NotificationIterator.interfaces.NotificationIterator;

public class Main {
    public static void main(String[] args) {
        NotificationCentre notificationCentre = new NotificationCentre();
        notificationCentre.addNotification(new Notification("Notification 1", true));
        notificationCentre.addNotification(new Notification("Notification 2", false));
        notificationCentre.addNotification(new Notification("Notification 3", true));
        notificationCentre.addNotification(new Notification("Notification 4", false));
        notificationCentre.addNotification(new Notification("Notification 5", true));


        NotificationIterator<Notification> allNotificationsIterator = notificationCentre.getAllNotificationsIterator();
        while (allNotificationsIterator.hasNext()) {
            Notification notification = allNotificationsIterator.getNext();
            System.out.println(notification.getMessage() + " - " + notification.isRead());
        }

        NotificationIterator<Notification> unreadNotificationsIterator = notificationCentre.getUnreadNotificationsIterator();
        while (unreadNotificationsIterator.hasNext()) {
            Notification notification = unreadNotificationsIterator.getNext();
            System.out.println(notification.getMessage() + " - " + notification.isRead());
        }
        
        NotificationIterator<Notification> readNotificationsIterator = notificationCentre.getReadNotificationsIterator();
        while (readNotificationsIterator.hasNext()) {
            Notification notification = readNotificationsIterator.getNext();
            System.out.println(notification.getMessage() + " - " + notification.isRead());
        }
    }
}
