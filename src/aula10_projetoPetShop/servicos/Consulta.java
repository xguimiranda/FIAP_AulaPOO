package aula10_projetoPetShop.servicos;

import aula10_projetoPetShop.Animal;
import aula10_projetoPetShop.Servico;

public class Consulta extends Servico {
    public Consulta(String descricao, int duracao) {
        super(descricao, duracao);
    }
    public double calcularCusto(Animal a) {
        return a.calcularPrecoBase() + 35;
    }
}
