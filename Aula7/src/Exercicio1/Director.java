package Exercicio1;

public class Director extends Employee {

    private int regionObjective;


    public Director(String name) {
        super(name);
    }

    public int getRegionObjective() {
        return regionObjective;
    }

    public void setRegionObjective(int regionObjective) {
        this.regionObjective = regionObjective;
    }

    @Override
    public double getSalary(){
        return super.getSalary() * 2 + getRegionObjective() * 0.01;
    }

    @Override
    public String toString() {
        return "Director: " + super.name + " - "  + "Salary: " + getSalary();
    }
}
