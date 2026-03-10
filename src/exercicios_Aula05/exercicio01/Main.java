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
        Scanner sc = new Scanner(System.in);


        sc.close();
    }
}
