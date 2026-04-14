package exercicios_Aula08.exercicio1;

public class Navio {
    private double capacidade;
    private int index;
    private Carga[] carga;

    public Navio() {
        this.capacidade = 10000;
        this.index = 0;
        this.carga = new Carga[20];
    }
