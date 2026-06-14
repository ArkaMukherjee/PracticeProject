import java.util.*;
import java.util.stream.Collectors;


public class Test1 {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int[] a = {1, 2, 3};
//        int[] b = {1, 2, 3};
//   Map<Integer, Long> result = Arrays.asList(a, b).stream().flatMap(v -> Arrays.stream(v).boxed()).collect(Collectors.groupingBy(value -> value, Collectors.counting()));
//       Integer value = result.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
//        List<Employee> employees = Arrays.asList(new Employee("A", 3000L, Arrays.asList("Barasat", "bwyu")), new Employee("A", 1000L, Arrays.asList("sgdhd", "ashdh")), new Employee("B", 2000L, Arrays.asList("0sgfdhf")));
////Collections.sort(employees);
//        // System.out.println(employees.stream().sorted(Comparator.comparingLong((Employee::salary))).toList());
//        // System.out.println(value);
//        System.out.println(employees.stream().flatMap(v->v.address().stream()).collect(Collectors.toSet()));
//        List<Integer> numbers = List.of(1, 2, 3, 6, 4, 5);
//        numbers.stream().mapToInt(V -> V).sum();
      //  System.out.println(numbers.stream().reduce(0, (v1, v2) -> v2 + v1).intValue());
        System.out.println("Hey".intern());

        int[][] a ={{1,2},{3,4}};

        Arrays.stream(a).flatMap(value-> Arrays.stream(value).boxed()).forEach(System.out::println);

    }
}

record Employee(String name, long salary, List<String> address) {

}

class Employee2 {
    private String name;
    private Long salary;

    public Employee2(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}


class A {

    int display(int value) {
        System.out.println("From A");
        return value;
    }
}

class B extends A {

    int display(int value, int value2) {
        System.out.println("From A");
        return value;
    }
}