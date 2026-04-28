package aula9_Heranca;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Empregado> lista = new ArrayList<>();

        lista.add(new EmpregadoComissionado(1, "Tigresa VIP", 10, 10));
        lista.add(new EmpregadoHorista(2, "Neymar", 10, 10));
        lista.add(0, new EmpregadoHorista(2, "Bruna Biancard", 10, 10));

        // for tradicional
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).nome);
        }

        System.out.println();
        
        //for generico
        for (Empregado empregado : lista){
            System.out.println(empregado);
            System.out.println(empregado.calcularSalario());
        }

    }
}
