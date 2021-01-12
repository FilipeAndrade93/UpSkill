package Exercicio1;

public abstract class Funcionario {
    private String nome;
    private String codigo;
    private double salarioBase;

    public Funcionario(String nome, String codigo, double salarioBase){
        this.nome = nome;
        this.codigo = codigo;
        this.salarioBase = salarioBase;
    }

    public abstract double calculaSalario();

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
