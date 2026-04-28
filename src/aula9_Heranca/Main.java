package aula9_Heranca;

public class Main {
    public static void main(String[] args) {
        Empregado[] empregado = new Empregado[4];

        empregado[0] = new EmpregadoComissionado(1, "Selmini", 350000, 20);
        empregado[1] = new EmpregadoHorista(2, "João", 160, 550);
        empregado[2] = new EmpregadoComissionado(3, "Patrícia", 700000, 23);
        empregado[3] = new EmpregadoHorista(4, "Maria", 200, 800);

        // for tradicional
        for(int i = 0; i < empregado.length; i++) {
            System.out.println(empregado[i].matricula);
            System.out.println(empregado[i].nome);
            System.out.println();
        }

        // for genérico
        System.out.println("#####################################");
        for(Empregado e : empregado) {
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println();
        }

    }
}