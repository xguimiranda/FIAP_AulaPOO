package aula9_Heranca;

public abstract class Empregado {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        super();
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Empregado{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
