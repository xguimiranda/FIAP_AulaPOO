package aula10_projetoPetShop.animais;

import aula10_projetoPetShop.Animal;

public class Passaro extends Animal {
    public Passaro(String nome, double peso) {
        super(nome, peso);
    }
    public double calcularPrecoBase(){
        return 30;
    }

}