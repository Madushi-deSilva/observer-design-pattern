package com.company.youtube;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //video publisher(subject) -> youtuber.java
        //subscriber -> YoutubeObserver.java
        //types of observers -> VideoWatcher, CommentReader

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first message:");
        String message1= scanner.nextLine();

        YoutubeObserver videoWatcher1 = new VideoWatcher(); //watching videos
        YoutubeObserver videoWatcher2 = new VideoWatcher(); //watching videos
        YoutubeObserver commentReader = new CommentReader(); //reading comments

        Youtuber youtuber = new Youtuber();

        //three observers have subscribe the channel
        youtuber.subscribe(videoWatcher1);
        youtuber.subscribe(videoWatcher2);
        youtuber.subscribe(commentReader);

        youtuber.notifyVideos(message1);

        System.out.println("***************");
        System.out.println("Enter the second message:");
        String message2= scanner.nextLine();

        youtuber.notifyVideos(message2);

        // second watcher unsubscribe the channel
        youtuber.unsubscribe(videoWatcher2);

        System.out.println("*****************");
        System.out.println("Enter the third message:");
        String message3= scanner.nextLine();

        youtuber.notifyVideos(message3);
    }
}
