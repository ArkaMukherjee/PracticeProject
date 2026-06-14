package com.company;

import java.sql.SQLOutput;

public class  Subscriber {
    private String name;

    public String getName() {
        return name;
    }

    public Subscriber(String name) {
        this.name=name;
    }

    public void update(Channel cha)
    {
        System.out.println("Hi "+name+ ", New video "+cha.getVideoName()+ " uploaded on channel "+ cha.getChannelName());
    }

}
