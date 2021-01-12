package Exercicio1;

public class Gerente extends Funcionario {

    public Gerente(String nome, String codigo, double salarioBase) {
        super(nome, codigo, salarioBase);
    }

    @Override
    public double calculaSalario() {
        return getSalarioBase() * 2;
    }
}
