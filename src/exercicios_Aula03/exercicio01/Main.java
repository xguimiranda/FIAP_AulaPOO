package exercicios_Aula03.exercicio01;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Digite o nome do correntista: ");
        String nome = sc.next();
        int numero = rd.nextInt(1000, 9999);
        double saldo = 0;
        Conta conta = new Conta(nome, numero, saldo);
        System.out.printf("Sua conta foi criada com sucesso!\n nome: %s \n Numero da conta: %d \n Seu saldo: R$%.2f\n",
                conta.getName(), conta.getNumeroDaConta(), conta.getSaldo());

        System.out.print("Quantos reais você quer depositar? ");
        double valor = sc.nextDouble();
        conta.deposito(valor);
        System.out.println("Seu saldo atualizado é de é de: R$"+ String.format("%.2f", conta.getSaldo()));
        System.out.print("Quantos reais você quer sacar? ");
        double saque = sc.nextDouble();
        conta.sacar(saque);
        System.out.println("Seu saldo atualizado é de é de: R$"+ String.format("%.2f", conta.getSaldo()));

        sc.close();
    }
}
