package com.company.youtube;

//video watcher class
public class VideoWatcher implements YoutubeObserver{

    @Override
    public void notifyVideo(String video) {
        System.out.println("Watch the video: " + video);
    }
}
