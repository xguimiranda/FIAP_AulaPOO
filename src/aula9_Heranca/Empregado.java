package aula9_Heranca;

public class Empregado {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        super();
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularSalario();

}
