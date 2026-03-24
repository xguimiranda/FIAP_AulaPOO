package exercicios_Aula07.exercicio1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Veiculo[] veiculo = new Veiculo[5];
    static int indexVeiculo;

    public static void main(String[] args) {

        int opcao;
        do {
            System.out.printf("\n#### Estacionamento ParkEasy ####\n" +
                    "[1] Entrada de veículo\n" +
                    "[2] Saída de veículo\n" +
                    "[3] Imprimir veículos estacionados\n" +
                    "[4] Imprimir a receita\n" +
                    "[5] Finalizar");
            opcao = sc.nextInt();

        }while (opcao !=5);

    }

    private static void registrarEntrada(){

    }

    private static Veiculo pesquisar(){
        String placa;
        System.out.print("Placa para pesquisa ----> ");
        placa = sc.next().toUpperCase();
        for (int i = 0; i < indexVeiculo; i++){
            if (veiculo[i].placa.equals(placa)) {
                return veiculo[i];
            }
        }
        return null;
    }
}


