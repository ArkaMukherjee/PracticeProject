package com;

import java.util.*;

public class FlightSystem {

    public static void main(String[] args) {

        FlightDetails f1= new FlightDetails(45,366,3);
        FlightDetails f2= new FlightDetails(45,356,6);
        FlightDetails f3= new FlightDetails(46,326,5);
        FlightDetails f4= new FlightDetails(45,377,4);
        FlightDetails f5= new FlightDetails(48,357,5);
        FlightDetails f6= new FlightDetails(54,357,5);
       // PriorityQueue<com.FlightDetails> flightQueue= new PriorityQueue<com.FlightDetails>();
        List<FlightDetails> flightDetailsList= Arrays.asList(f1,f2,f3,f4,f5,f6);
        FligthComparator fligthComparator= new FligthComparator();
        Collections.sort(flightDetailsList,fligthComparator);

        for(int i=0;i<flightDetailsList.size();i++)
        {
            System.out.println(flightDetailsList.get(i));
        }

        FlightDetails landingFligh=flightDetailsList.get(0);
        System.out.println(flightDetailsList.get(0).flightNumber);

        for(int i =1;i<flightDetailsList.size();i++)
        {
            if(flightDetailsList.get(i).time>=landingFligh.time+landingFligh.duration)
            {
                landingFligh=flightDetailsList.get(i);
                System.out.println(flightDetailsList.get(i).flightNumber);
            }
        }


       /* int endTime=flightDetailsList.get(0).time+flightDetailsList.get(0).duration;
        System.out.println("fligth number :"+flightDetailsList.get(0).flightNumber);
        for (com.FlightDetails flightDetails : flightDetailsList) {
            if(flightDetails.time>endTime)
            {
                System.out.println("fligth number :"+flightDetails.flightNumber);

                endTime=flightDetails.time+flightDetails.duration;
            }
        }*/

    }

}

class FligthComparator implements Comparator<FlightDetails>
{

    @Override
    public int compare(FlightDetails o1, FlightDetails o2) {
        if(o1.time>o2.time)
            return 1;
        else if(o1.time<o2.time)
            return -1;
        else if(o1.time==o2.time)
        {
            return o1.flightNumber-o2.flightNumber;
        }
        return 0;
    }
}

class FlightDetails
{
    public int time;
    public int flightNumber;
    public int duration;

    public FlightDetails(int time,int flightNumber,int duration )
    {
        this.time=time;
        this.duration=duration;
        this.flightNumber=flightNumber;
    }

    @Override
    public String toString() {
        return "com.FlightDetails{" +
                "time=" + time +
                ", flightNumber=" + flightNumber +
                ", duration=" + duration +
                '}';
    }
}