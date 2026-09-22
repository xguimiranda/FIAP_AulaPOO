package aula13.exercicio4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercicio04 {
    public static void main(String[] args) {
        List<Produto> lista = Arrays.asList(
                new Produto("note", 12000, "eletrônicos",
                        5, true),
        new Produto("agenda", 1200, "papelaria",
                4, true),
                new Produto("Iphone Duo", 22000, "eletrônicos",
                        5, true),
                new Produto("Apple Magic", 1200, "periféricos",
                        4, true)
        );

        Predicate<Produto> criterio = p -> p.emEstoque() && p.avaliacao() >= 4;
        List<ProdutoFinal> listaFinal = lista.stream()
                .filter(criterio)
                .map(p -> {
                    double precoFinal;
                    if (p.categoria().equals("eletrônicos")){
                        precoFinal = p.preco() * 0.85;
                    } else {
                        precoFinal = p.preco() * 0.90;
                    }
                    return new ProdutoFinal(p.nome().toUpperCase(),
                            precoFinal, p.categoria());
                })
                .toList();
        listaFinal.forEach(System.out::println);

        // Item 03 --> agrupamento por categoria
        System.out.println("\nProdutos por Categoria:");
        Map<String, List<ProdutoFinal>> grupo = listaFinal.stream()
                .collect(Collectors.groupingBy(ProdutoFinal::categoria));
        grupo.forEach((categoria, pFinal) ->{
            System.out.println(categoria);
            pFinal.forEach(System.out::println);
        });

        //Item 04 --> ordenar por preco decrescente
        System.out.println("\nProdutos por Categoria e preço decrescente:");
        grupo.forEach((categoria, produtos) -> {
            System.out.println(categoria);
            produtos.stream()
                    .sorted(Comparator.comparingDouble(ProdutoFinal::preco).reversed())
                    .forEach(System.out::println);
        });

//        Map<String, List<ProdutoFinal>> grupo2 = listaFinal.stream()
//                .sorted(Comparator.comparingDouble(ProdutoFinal::preco).reversed())
//                .collect(Collectors.groupingBy(ProdutoFinal::categoria));
//        grupo2.forEach((categoria, pFinal) ->{
//            System.out.println(categoria);
//            pFinal.forEach(System.out::println);
//        });

        //item 05 --> ranking dos mais caros
        System.out.println("\nRanking dos mais caros:");
        List<ProdutoFinal> raking = listaFinal.stream()
                .sorted(Comparator.comparingDouble(ProdutoFinal::preco).reversed())
                .limit(3)
                .toList();


        raking.forEach(System.out::println);


    }
}

//        lista.stream()
//                .filter(criterio)
//                .map(p -> {
//                    double precoFinal;
//                    if (p.categoria().equals("eletrônicos")){
//                        precoFinal = p.preco() * 0.85;
//                    } else {
//                        precoFinal = p.preco() * 0.90;
//                    }
//                    return new ProdutoFinal(p.nome().toUpperCase(),
//                            precoFinal, p.categoria());
//                }).forEach(System.out::println);