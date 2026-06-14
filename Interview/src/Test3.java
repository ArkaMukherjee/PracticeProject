import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {

        List<Emp> emps = Arrays.asList(new Emp("Balkrishna", "pune", 1, new Dept("dept1", "pune")),
                new Emp("Bikram", "delhi", 2, new Dept("dept2", "delhi")),
                new Emp("Pooja", "pune", 6, new Dept("dept1", "pune")),
                new Emp("Akas", "bengaluru", 5, new Dept("dept1", "bengaluru")),
                new Emp("Samir", "pune", 4, new Dept("dept1", "pune")),
                new Emp("Akas", "delhi", 3, new Dept("dept2", "delhi")),
                new Emp("Samir", "delhi", 7, new Dept("dept2", "delhi")));

        //emps.forEach(a -> System.out.println(a));

        // emps.stream().map(value->value.getDept()).collect(Collectors.groupingBy(dept->., Collector.list()))
        Map<Dept, List<Emp>> departmentWiseEmployeeMap = emps.stream().collect(Collectors.groupingBy(value -> value.getDept(), Collectors.toList()));
        //  System.out.println("========================");
     //  departmentWiseEmployeeMap.forEach((k,v)-> System.out.println(k.toString() +"----"+));
        departmentWiseEmployeeMap.keySet().forEach(a -> System.out.println(a +" :: "+ departmentWiseEmployeeMap.get(a)));
    }


}


class Emp {
    private String name;
    private String city;
    private Integer empId;
    private Dept dept;

    public Emp(String name, String city, Integer empId, Dept dept) {
        super();
        this.name = name;
        this.city = city;
        this.empId = empId;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp [name=" + name + ", city=" + city + ", empId=" + empId + ", dept=" + dept + "]";
    }
}

class Dept {

    private String deptName;
    private String deptCity;


    public Dept(String deptName, String deptCity) {
        super();
        this.deptName = deptName;
        this.deptCity = deptCity;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCity() {
        return deptCity;
    }

    public void setDeptCity(String deptCity) {
        this.deptCity = deptCity;
    }

    @Override
    public String toString() {
        return "Dept [deptName=" + deptName + ", deptCity=" + deptCity + "]";
    }
}