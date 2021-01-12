package Exercicio1;

public class Main {

    public static void main(String[] args) {
        Employee filipe = new Employee("Filipe Andrade");
        Manager amilcar = new Manager("Amilcar Alhadas");
        Manager adolfo = new Manager("Adolfo Dias");
        Director monica = new Director("Mónica Galhão");
        Company lw = new Company("Le Wagon");

        amilcar.setStoreObjective(true);
        monica.setRegionObjective(100000);

        lw.addEmployee(filipe);
        lw.addEmployee(amilcar);
        lw.addEmployee(monica);
        lw.addEmployee(adolfo);

        lw.printEmployees();

        System.out.println("Total Payroll of " + lw.getName() + ": " + lw.payroll());
    }
}
