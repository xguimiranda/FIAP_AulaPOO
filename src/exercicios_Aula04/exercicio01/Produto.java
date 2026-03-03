package exercicios_Aula04.exercicio01;

public class Produto {
    String name;
    double value;
    int quantity;

    public Produto() {
    }

    public Produto(String name, double value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public void aumentarValor(double porcentagem){
        this.value += value * (porcentagem /100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
