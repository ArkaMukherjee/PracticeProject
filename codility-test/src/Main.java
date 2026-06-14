import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] a = {2,3};
       // Main.solution(10,a, 2);
        System.out.println(Main.solution(10,a, 2));
    }


    public static int solution(int X, int[] B, int Z) {
        // Implement your solution here
        int downloadedBytesTill = Arrays.stream(B).sum();
        float averageRate = 0.0f;
        if (B.length < Z) {
            averageRate = downloadedBytesTill / B.length;
        } else {
            int downloadedBytes = 0;
            for (int i = (B.length - 1); i >((B.length - 1)-Z); i--) {
                downloadedBytes = downloadedBytes + B[i];
            }
            String[] s ={"1"};
            Arrays.stream(s).map(Integer::parseInt).reduce(0, (a, b) -> a + b);
            averageRate = downloadedBytes / Z;
        }

        if (X == downloadedBytesTill) {
            return 0;
        } else if (X > downloadedBytesTill) {
            int remainingBytes = X - downloadedBytesTill;
            int remainingTime = 0;
            return remainingTime;
        } else {
            return -1;
        }
    }
}
