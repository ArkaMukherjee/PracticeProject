import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.DoubleToIntFunction;

//@RestrController
//@Path(/Calculator)
public class Interview {

    /*@GetMapping(/addition)
    public Response<Integer> calculateSum(@PathParam("paramA") Integer param1, @PathParam("paramB") Integer param2)
    {
        Interger result = param1+param2;
        return Response.builder.(result).ok;
    }*/
    public static void main(String[] args) {
        ThreadLocal<String> t = new ThreadLocal<String>();
        int target = 7;
       int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int minLength=Integer.MAX_VALUE;
        int start=0, end=0;
        int curLength=0;
        int curr_sum=0;
        while(end<nums.length)
        {
            if(curr_sum>=target)
            {
                curLength = (end-start)+1;
                curr_sum=curr_sum-nums[start];
                minLength= Math.min(curLength,minLength);
                start++;

            }
            else
            {
                curr_sum=curr_sum+nums[end];
                end++;
            }
        }
        return minLength;
    }
}
