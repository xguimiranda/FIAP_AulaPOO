package aula10_projetoPetShop.servicos;

import aula10_projetoPetShop.Animal;
import aula10_projetoPetShop.Servico;

public class Banho extends Servico {
    public Banho(String descricao, int duracao) {
        super(descricao, duracao);
    }
    public double calcularCusto(Animal a){
        return a.calcularPrecoBase()+(duracao * 0.5);
    }

}
