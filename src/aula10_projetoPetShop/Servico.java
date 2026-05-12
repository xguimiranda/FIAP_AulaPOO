package aula10_projetoPetShop;

public abstract class Servico {
    protected String descricao;
    protected int duracao;

    public Servico(String descricao, int duracao) {
        this.descricao = descricao;
        this.duracao = duracao;
    }
    public abstract double calcularCusto(Animal a);
}
