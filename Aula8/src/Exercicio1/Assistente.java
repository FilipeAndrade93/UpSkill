package Exercicio1;

public class Assistente extends Funcionario {

    public Assistente(String nome, String codigo, double salarioBase) {
        super(nome, codigo, salarioBase);
    }

    @Override
    public double calculaSalario() {
        return getSalarioBase();
    }
}
