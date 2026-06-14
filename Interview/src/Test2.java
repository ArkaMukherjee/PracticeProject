import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("Main");

        Map<String, Integer> map = Map.of("A", 1, "B", 4, "C", 50);

        System.out.println(map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get());

        //To print minimum use default priority queue --
       // PriorityQueue<Integer> queue = new PriorityQueue<>();
        // To print maximum use custom Comparator

         PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.offer(1);

        queue.offer(-1);
        queue.offer(-10);
        queue.offer(11);
        queue.offer(15);

        System.out.println(queue.peek());

        // Use stack

    }
}
