package exercicios_Aula05.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Bilhete bilhete;

    static {
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Você é Estudante/Professor ou Normal: ");
        String tipoTarifa = sc.next();
        while (!tipoTarifa.equalsIgnoreCase("Estudante")
                && !tipoTarifa.equalsIgnoreCase("Professor")
                && !tipoTarifa.equalsIgnoreCase("Normal")){

            System.out.print("Erro! Escolha entre Estudante, Professor ou Normal: ");
            tipoTarifa = sc.next();
        }
        bilhete = new Bilhete(nome, tipoTarifa);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int opcao;

        do{
            System.out.print("\n **********MENU********** \n Escolha sua opção: \n 1- Carregar Bilhete \n 2- Consultar Saldo \n 3- Passar na catraca \n 4- Sair \n");
            opcao = sc.nextInt();
            
            switch (opcao){
                case 1 -> carregar();
                case 2 -> consultarSaldo();
                case 3 -> catraca();
                case 4 -> System.out.println("Obrigado por usar nosso APP!");
                default -> System.out.println("Opção invalida!");
            }

        }while (opcao != 4);

        sc.close();
    }

    private static void catraca() {
        if (!bilhete.passarNaCatraca()) {
            System.out.println("❌ Saldo insuficiente!");
        } else {
            System.out.println("✅ Catraca liberada! Boa viagem.");
        }
        consultarSaldo();
    }

    private static void consultarSaldo() {
        System.out.println("Saldo atual --> R$" + String.format("%.2f", bilhete.getSaldo()));
    }

    private static void carregar() {
        double valor;
        System.out.print("Valor da recarga --> R$");
        valor = sc.nextDouble();
        bilhete.carregar(valor);
    }
}
