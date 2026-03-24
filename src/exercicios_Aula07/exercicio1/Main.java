package exercicios_Aula07.exercicio1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Veiculo[] veiculo = new Veiculo[5];
    static int indexVeiculo;
    static Registro[] registro = new Registro[20];
    static int indexRegistro;

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

            switch (opcao){
                case 1 -> registrarEntrada();
                case 2 -> estacionados();
            }

        }while (opcao !=5);

    }

    private static void estacionados() {
        for (int i = 0; i < indexRegistro; i++){
            System.out.print(registro[i].veiculo.placa);
        }
    }

    private static void registrarEntrada(){
        String nome;
        String marca, modelo, placa;
        long cpf;
        String horaEntrada;

        Veiculo veiculoEncontrado = pesquisar();
        if (veiculoEncontrado == null){
            System.out.print("Nome do proprietario: ");
            nome = sc.next();
            System.out.print("CPF do proprietario : ");
            cpf =  sc.nextLong();
            System.out.print("Placa do Veiculo: ");
            placa = sc.next().toUpperCase();
            System.out.print("Modelo do veiculo: ");
            modelo = sc.next();
            System.out.print("Marca do veiculo: ");
            marca = sc.next();
            Proprietario proprietario = new Proprietario(nome, cpf);
            veiculo[indexVeiculo++] = new Veiculo(placa, modelo, marca, proprietario);
        }
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
        System.out.println("Veiculo não encontrado!");
        return null;
    }
}


