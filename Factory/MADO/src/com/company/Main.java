package com.company;

public class Main {

    public static void main(String[] args) {
        AnnouncementFactory announcementFactory=new AnnouncementFactory();
        Announcement announcement=announcementFactory.createAnnouncement("telegram");
        announcement.notifyUser();
    }
}
