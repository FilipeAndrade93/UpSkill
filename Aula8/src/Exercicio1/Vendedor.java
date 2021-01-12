package Exercicio1;

public class Vendedor extends Funcionario {

    public double comissao;

    public Vendedor(String nome, String codigo, double salarioBase, double comissao) {
        super(nome, codigo, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        return getSalarioBase() + (getSalarioBase() * (comissao/100));
    }
}