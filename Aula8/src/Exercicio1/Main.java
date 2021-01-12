package Exercicio1;

public class Main {

    public static void main(String[] args) {
        Funcionario vendedor = new Vendedor("Joelio", "OIU", 500, 50);
        Funcionario assistente = new Assistente("Reinaldo", "RYTR", 500);
        Funcionario gerente = new Gerente("Ivanilson", "OIYUYG", 500);

        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Salário - " + vendedor.calculaSalario());
        System.out.println("Assistente:");
        System.out.println(assistente.calculaSalario());
        System.out.println("Gerente:");
        System.out.println(gerente.calculaSalario());
    }
}
