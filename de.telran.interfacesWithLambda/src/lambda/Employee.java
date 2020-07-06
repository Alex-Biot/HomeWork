package lambda;
//Given a class Employee with name and salary. Return an employee salary using 1. Supplier, 2. Function.
public class Employee {
    private String name;
    private Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

}
