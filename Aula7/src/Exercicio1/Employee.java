package Exercicio1;

public class Employee {

    protected String name;
    private final double salary;

    public Employee(String name){
        this.name = name;
        this.salary = 800;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " - "  + "Salary: " + salary;
    }
}
