import java.util.Arrays;
import java.util.List;

public class Hackersrank {

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        // Write your code here

        int a=0;
        int count=0;
        //Set<Integer> holdSet= new HashSet<>();
        int sum =0 ;
        while(a<responseTimes.size()-1)
        {

            int average= a>0? sum/(a): 0 ;
            sum = sum+ responseTimes.get(a);


            if(average != 0 && average < responseTimes.get(a))
            {
                count++;
            }
            a++;
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(countResponseTimeRegressions(Arrays.asList(1, 100)));
    }
}
