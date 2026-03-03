package exercicios_Aula04.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("****** Sistema de criar produtos ******");
        System.out.print("Quantos produtos você quer criar? ");
        int n = sc.nextInt();
        Produto[] produto = new Produto[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Produto "+ (i+1)+ ":");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Valor: ");
            double value = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();
            produto[i] = new Produto(name, value, quantity);
        }
        System.out.println("Qual é o nome do produto você quer aumentar o valor: ");
        String name = sc.next();
        int p = -1;
        for (int i = 0; i < n; i++){
            if (name.equalsIgnoreCase(produto[i].getName())){
                p = i;
                break;
            }
        }
        if (p == -1){
            System.out.println("Produto não encontrado!");
            return;
        }

        int indice = p;

        System.out.print("Digite a porcentagem de aumento (0-100): ");
        double porcentagem = sc.nextDouble();
        while (porcentagem < 0 || porcentagem > 100){
            System.out.println("Digite um valor valido(0-100): ");
            porcentagem = sc.nextDouble();
        }

        produto[indice].aumentarValor(porcentagem);
        System.out.println("Novo valor do produto " + produto[indice].getName() + ": " + String.format("%.2f R$", produto[indice].getValue()));


        sc.close();
    }
}
