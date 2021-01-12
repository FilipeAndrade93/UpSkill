package Exercicio1;

public class Manager extends Employee {

    private boolean storeObjective;

    public Manager(String name) {
        super(name);
    }

    public void setStoreObjective(boolean storeObjective) {
        this.storeObjective = storeObjective;
    }

    @Override
    public double getSalary() {
        if (storeObjective) {
            return super.getSalary() + 200;
        } else {
            return super.getSalary();
        }
    }

    @Override
    public String toString() {
        return "Manager: " + super.name + " - "  + "Salary: " + getSalary();
    }
}
