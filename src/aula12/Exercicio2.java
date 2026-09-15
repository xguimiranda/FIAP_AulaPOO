package aula12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();
        empregados.add(new Empregado("Nicolas", 1000, 1));
        empregados.add(new Empregado("Guilherme", 2000, 2));
        empregados.add(new Empregado("Kenny", 3000, 3));

        List<Empregado> ajusteSalarial = empregados.stream()
                .map(emp -> {
                    double valor;
                    if (emp.anoDeExperiencia() >= 5){
                        valor = emp.salario() * 1.20;
                    }
                    else {
                        valor = emp.salario() * 1.10;
                    }
                    return new Empregado(emp.nome(), valor, emp.anoDeExperiencia());
                })
                .sorted(Comparator.comparing(Empregado::nome))
                .toList();

        ajusteSalarial.forEach(System.out::println);
    }
}
