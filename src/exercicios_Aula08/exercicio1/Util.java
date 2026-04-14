package exercicios_Aula08.exercicio1;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {
    public void menu(){
      int opcao;
        do {
          String aux = "Reserva de cargas viagens\n";
          aux += "[1] Reservar\n";
          aux += "[2] Pesquisar\n";
          aux += "[3] Exibir\n";
          aux += "[4] Capacidade reservada\n";
          aux += "[5] Cancelar\n";
          aux += "[6] Finalizar\n";
          opcao =  parseInt(showInputDialog(aux));
          if (opcao < 1 || opcao > 6){
            showMessageDialog(null, "Opção inválida");
          } else {
            switch (opcao) {
              case 1 -> reservar();
              case 2 -> pesquisar();
              case 3 -> exibir();
              case 6 -> showMessageDialog(null, "Até breve!");
            }
          }
      } while (opcao != 6);
    }

  
}
