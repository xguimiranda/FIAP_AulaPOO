package aula12.exercicio1;

import java.util.Arrays;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Selmini", "Ana", "Maria", "Antonio");

        List<String> nomes = list.stream()
                .filter(nome -> nome.startsWith("A"))
                .map(nome -> nome.toUpperCase())
                .sorted()
                .toList();

        nomes.forEach(System.out::println);
    }
}
