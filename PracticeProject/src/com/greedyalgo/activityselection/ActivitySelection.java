package com.greedyalgo.activityselection;

import javax.xml.soap.SOAPPart;
import java.util.Arrays;

public class ActivitySelection {
    public static void main(String[] args) {
        Activity a1= new Activity("A1",0,6);
        Activity a2= new Activity("A2",3,4);
        Activity a3= new Activity("A3",1,2);
        Activity a4= new Activity("A4",5,9);
        Activity a5= new Activity("A5",5,7);
        Activity a6= new Activity("A6",8,9);
        Activity[] activityArray= { a1,a2,a3,a4,a5,a6};
        Arrays.sort(activityArray,(e1,e2)-> e1.endTime.compareTo(e2.endTime));
        System.out.println(activityArray[0].name);
        int currentENdTime=activityArray[0].endTime;
        for(int i=1;i <activityArray.length;i++)
        {
            if(activityArray[i].startTime>currentENdTime)
            {
                System.out.println(activityArray[i].name);
                currentENdTime=activityArray[i].endTime;
            }
        }
    }

    static class Activity
    {
        String name;
        Integer startTime;
        Integer endTime;

        Activity(String name,Integer startTime,Integer endTime)
        {
            this.name=name;
            this.startTime=startTime;
            this.endTime=endTime;
        }
    }
}
