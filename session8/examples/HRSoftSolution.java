import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private String designation;
    private String location;

    public Employee(String name, int age, String designation, String location) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

public class HRSoftSolution {

    public static List<Employee> employees = new ArrayList<>();

    //Print all the employees using toString() method
    public static void printEmployees () {
        employees.forEach(System.out::println);
    }

    //return list of all the employees who have specified designation
    public static List<Employee> getEmployeesByDesignation (String designation) {
        return employees.stream()
                .filter(e -> e.getDesignation().equals(designation))
                .collect(Collectors.toList());
    }

    //return list of names of all the employees who are located at the specified location
    public static List<String> getNamesByLocation (String location) {
        return employees.stream()
                .filter(employee -> employee.getLocation().equals(location))
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    //return list of names of all the managers sorted by age
    public static List<String> getManagerNamesSortedByAge () {
        return employees.stream()
                .filter(employee -> employee.getDesignation().equals("Manager"))
                .sorted(Comparator.comparing(Employee::getAge))
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    //return sum of age of employees who are located at the specified location
    public static int getSumOfAgeByLocation (String location) {
        return employees.stream()
                .filter(employee -> employee.getLocation().equals(location))
                .map(Employee::getAge)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        employees.add(new Employee("Emp1", 26, "SD", "Bengaluru"));
        employees.add(new Employee("Emp2", 22, "Intern", "Bengaluru"));
        employees.add(new Employee("Emp3", 31, "Manager", "Bengaluru"));
        employees.add(new Employee("Emp4", 24, "SD", "Mumbai"));
        employees.add(new Employee("Emp5", 21, "Intern", "Mumbai"));
        employees.add(new Employee("Emp6", 25, "SD", "Bengaluru"));
        employees.add(new Employee("Emp7", 30, "Manager", "Mumbai"));

        System.out.println(getSumOfAgeByLocation("Mumbai"));
    }
}
