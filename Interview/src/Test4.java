import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {

//    Create Employee class with 3 fields as empName, salary , department.
//
//    create list of employee records with different department names and at least 5 records per department .
//
//    Find top 3 highest paid employees per department.

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee("John", 10000L, "IT"),
                new Employee("Paul", 20000L, "ACCOUNTS"),
                new Employee("Tim", 30000L, "IT"),
                new Employee("Vivek", 40000L, "IT"),
                new Employee("Stephen", 5000L, "ACCOUNTS")
        );

        List<String> employeesSorted = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getEmpName)
                .toList();
        System.out.println("Top Salary " + employeesSorted.get(0));
        System.out.println(" 2nd Top Salary " + employeesSorted.get(1));

        Map<String, List<Employee>> employeeMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
    }


//    record Employee(String empName, Long salary, String Department) {
//    }

    static class Employee {
        private String empName;
        private Long salary;
        private String Department;

        public Employee(String empName, Long salary, String department) {
            this.empName = empName;
            this.salary = salary;
            Department = department;
        }

        public String getDepartment() {
            return Department;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }
    }
}
