package com.company;

public class WhatsAppNotify implements Announcement{
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS  notification from WhatsApp");

    }
}
