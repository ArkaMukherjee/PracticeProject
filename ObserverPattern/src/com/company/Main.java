package com.company;

public class Main {

    public static void main(String[] args) {

        Subscriber s1 = new Subscriber("Ramesh");
        Subscriber s2 = new Subscriber("Avishek");
        Subscriber s3 = new Subscriber("Suresh");
        Subscriber s4 = new Subscriber("Ram");
        Subscriber s5 = new Subscriber("John");

        Channel ch = new Channel();

        //Subscribe Channel.
        ch.subscribe(s1);
        ch.subscribe(s2);
        ch.subscribe(s3);
        ch.subscribe(s4);
        ch.subscribe(s5);

        //Unsubscribe
        ch.unsubscribe(s3);

        ch.UploadVideo();

    }

}
