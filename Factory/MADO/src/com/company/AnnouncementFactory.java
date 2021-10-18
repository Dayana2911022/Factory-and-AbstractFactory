package com.company;

public class AnnouncementFactory {
    public Announcement createAnnouncement(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        if ("telegram".equals(channel)) {
            return new TelegramNotify();
        }
        else if ("whatsapp".equals(channel)) {
            return new WhatsAppNotify();
        }
        else if ("PUSH".equals(channel)) {
            return new PushNotification();
        }
        return null;
    }
}