package aula11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candidato> lista = new ArrayList<>();

        lista.add(new Candidato("Patricia", 9.9, 20));
        lista.add(new Candidato("Selmini", 7, 26));
        lista.add(new Candidato("Antorino", 9.9, 20));
        lista.add(new Candidato("Maria", 10, 20));

        lista.sort(Comparator.comparing(Candidato::getNome).reversed());


        lista.sort(Comparator.comparingDouble(Candidato::getNotaTecnica)
                .thenComparingInt(Candidato::getAnoExperiencia).reversed()
                .thenComparing(Candidato::getNome)
        );

        lista.forEach(candidato -> {
            System.out.println(candidato);
        });
    }
}
