package com.company;

public class PushNotification implements Announcement{
    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification");
    }
}
