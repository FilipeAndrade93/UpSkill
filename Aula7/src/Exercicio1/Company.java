package Exercicio1;

public class Company {
    Employee[] employees;
    String name;

    public Company(String name){
        this.employees = new Employee[4];
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee){
        for (int i = 0; i < employees.length; i++){
            if (employees[i] == null){
                employees[i] = employee;
                break;
            }
        }
    }

    public void printEmployees(){
        for (int i = 0; i < employees.length; i++){
            Employee a = employees[i];
            System.out.println(a);
        }
    }

    public double payroll(){
        double sum  = 0;
        for (int i = 0; i < employees.length; i++){
            Employee a = employees[i];
            sum = sum + a.getSalary();
        }
        return sum;
    }
}
