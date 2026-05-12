package aula10_projetoPetShop.animais;

import aula10_projetoPetShop.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularPrecoBase(){
        if(peso <= 10){
            return 40;
        }
        if (peso <= 25){
            return 60;
        }
        return 85;
    }
}