import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {


        List<EmployeeOne> employeeList = new ArrayList<EmployeeOne>();
        employeeList.add(new EmployeeOne(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new EmployeeOne(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new EmployeeOne(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new EmployeeOne(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new EmployeeOne(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new EmployeeOne(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new EmployeeOne(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new EmployeeOne(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new EmployeeOne(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new EmployeeOne(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new EmployeeOne(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new EmployeeOne(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new EmployeeOne(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new EmployeeOne(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new EmployeeOne(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new EmployeeOne(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new EmployeeOne(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


//        Map<String, Double> averagingMap = new HashMap<>();
//        averagingMap.put("Male", employeeList.stream()
//                .filter(e -> "Male".equals(e.getGender()))
//                .collect(Collectors.averagingDouble(EmployeeOne::getSalary)));
//        averagingMap.put("Female", employeeList.stream()
//                .filter(e -> "Female".equals(e.getGender()))
//                .collect(Collectors.averagingDouble(EmployeeOne::getSalary)));
//        System.out.println(averagingMap);

     //   Map<String, Double> averagingMap = employeeList.stream()
              //  .collect(Collectors.groupingBy(e -> "Male".equals(e.getGender()) ? "Male" : "Female", Collectors.averagingDouble(EmployeeOne::getSalary)));

     //   System.out.println(averagingMap);

        Map<String, Map<String, Long>> genderCountByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(
                        EmployeeOne::getDepartment,
                        Collectors.groupingBy(EmployeeOne::getGender, Collectors.counting())
                ));

        System.out.println(genderCountByDepartment);

    }
}

class EmployeeOne {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public EmployeeOne(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }
}
