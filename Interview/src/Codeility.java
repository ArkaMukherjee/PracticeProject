import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codeility {

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 4};
        Arrays.stream(solution(a)).forEach(System.out::println);
    }/
    static int[] solution(int[] numbers) {
        // handle null or too-short input
        if (numbers == null || numbers.length < 3) {
            return new int[0];
        }

        // int[] output = new int[numbers.length - 2];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < numbers.length - 1; i++) {
            if ((numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1])
                    || (numbers[i] < numbers[i - 1] && numbers[i] < numbers[i + 1])) {
                list.add(1);
            } else {
                list.add(0);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
