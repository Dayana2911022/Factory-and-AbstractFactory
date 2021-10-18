package com.company;

public class TelegramNotify implements Announcement{
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS  notification from Telegram");
    }
}
