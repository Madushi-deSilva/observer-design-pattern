package com.company.youtube;

//comment reader class
public class CommentReader implements YoutubeObserver{

    @Override
    public void notifyVideo(String video) {
        System.out.println("Read the comments: " + video);
    }
}
