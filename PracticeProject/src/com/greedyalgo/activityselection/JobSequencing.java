package com.greedyalgo.activityselection;

import javax.xml.soap.SOAPPart;
import java.sql.SQLOutput;
import java.util.Arrays;

public class JobSequencing {

    public static void main(String[] args) {

        Job j1= new Job("A1",2,100);
        Job j2= new Job("A2",1,19);
        Job j3= new Job("A3",2,27);
        Job j4= new Job("A4",1,25);
        Job j5= new Job("A5",3,15);
       // Job j6= new Job("A6",2,100);

        Job[] josArray= {j1,j2,j3,j4,j5};
        boolean[] slots= {false,false,false,false,false};
        Arrays.sort(josArray, (p1,p2)-> p2.profit.compareTo(p1.profit));

        int length=josArray.length;
        for(int m=0;m<length;m++)
        {
            System.out.println("JOb after SOrt");
            System.out.println(josArray[m].jobName);
        }

        System.out.println("Scheduled job");
        for(int i=0;i<length;i++)
        {
            for(int j= Math.min(length,josArray[i].deadline)-1;j>=0;j--) {
                if (slots[j] == false) {
                    System.out.println(josArray[i].jobName);
                    slots[j] = true;
                    break;
                }
            }
        }
    }

    static class Job
    {
        String jobName;
        int deadline;
        Integer profit;

        public Job(String jobName,int deadline,int profit)
        {
            this.jobName=jobName;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
}
