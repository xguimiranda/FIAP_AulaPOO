package aula10_projetoPetShop;

public abstract class Animal {
    protected String nome;
    protected double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }
    public abstract double calcularPrecoBase();
}