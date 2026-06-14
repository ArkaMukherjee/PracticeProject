import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Interview {

    public static void main(String[] args) {

        Map<String, Integer> grading = Map.of("A+",1,"B+",2,"C+",3);
        Friend f1 = new Friend("Aima", "A+");

        Friend f2 = new Friend("Jay", "B+");

        Friend f3 = new Friend("Shekhar", "C+");
        List<Friend> friends = Arrays.asList(f1, f2, f3 );

        //   Collections.sort(v->v.getGrade());

        //   friends.forEach(f-> System.out.println(f.getName()));

        friends.stream()
                .sorted(Comparator.comparing(Friend::getGrade).reversed())
                .forEach(f-> System.out.println(f.toString()));


        // create objects, sort and out sorted object
    }


}

class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class Friend {

    private String name;

    private String grade;

    public Friend (String name, String grade)
    {
        this.name= name;
        this.grade= grade;
    }
    public String getName()
    {
        return this.name;
    }

    public String getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
