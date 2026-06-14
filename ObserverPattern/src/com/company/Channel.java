package com.company;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String channelName = "MyChannel";
    private List<Subscriber> sublist = new ArrayList<>();
    private String videoName;

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public void subscribe(Subscriber sub) {
        sublist.add(sub);
    }

    public String getVideoName() {
        return videoName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void unsubscribe(Subscriber sub) {
        sublist.remove(sub);
    }

    public void UploadVideo() {
        for (Subscriber sub : sublist) {
            this.setVideoName("'How to Learn Java'");
            sub.update(this);
        }
    }
}
