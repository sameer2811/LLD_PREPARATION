package IteratorDesignPattern.NotificationIterator.models;

public class Notification {

    private String message;
    private boolean isRead;

    public Notification(String message, boolean isRead) {
        this.message = message;
        this.isRead = isRead;
    }
    
    public String getMessage() {
        return message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

}
