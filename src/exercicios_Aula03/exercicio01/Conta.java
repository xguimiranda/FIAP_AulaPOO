package exercicios_Aula03.exercicio01;

public class Conta {
    private String name;
    private Integer numeroDaConta;
    private Double saldo;

    public Conta() {
    }

    public Conta(String name, int numeroDaConta, double saldo) {
        this.name = name;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void deposito(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

}

