package com.company.youtube;

import java.util.ArrayList;
import java.util.List;

//this is the subject class
public class Youtuber {

    List<YoutubeObserver> youtubeObservers = new ArrayList<>();

    //subscribe
    public void subscribe(YoutubeObserver youtubeObserver){

        youtubeObservers.add(youtubeObserver);
    }

    //unsubscribe
    public void unsubscribe(YoutubeObserver youtubeObserver){

        youtubeObservers.remove(youtubeObserver);
    }

    //when a new video is available
    public void notifyVideos(String video){
        for(YoutubeObserver youtubeObserver: youtubeObservers){
            youtubeObserver.notifyVideo(video);
        }
    }
}
