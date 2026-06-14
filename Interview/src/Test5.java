import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test5 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Virat Kohli", "Rohit Sharma", "R Aswin");
        Map<String, String> nameMap = names.stream()
                .collect(Collectors.toMap(v -> v.split(" ")[1], Function.identity()));

        names.stream()
                .sorted(Comparator.comparing(v -> v.split(" ")[1]))
                .forEach(System.out::println);
    }

}


record Player(String firstName, String lastName) {
}
