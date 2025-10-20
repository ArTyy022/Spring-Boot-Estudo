package com.example.Modulo.Tres.AtividadeOito;

import com.example.Modulo.Tres.AtividadeSete.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<com.example.Modulo.Tres.AtividadeSete.Produto> produtos = Arrays.asList(
                new com.example.Modulo.Tres.AtividadeSete.Produto("Smartphone", 800.0, "Eletrônicos"),
                new com.example.Modulo.Tres.AtividadeSete.Produto("Notebook", 1500.0, "Eletrônicos"),
                new com.example.Modulo.Tres.AtividadeSete.Produto("Teclado", 200.0, "Eletrônicos"),
                new com.example.Modulo.Tres.AtividadeSete.Produto("Cadeira", 300.0, "Móveis"),
                new com.example.Modulo.Tres.AtividadeSete.Produto("Monitor", 900.0, "Eletrônicos"),
                new com.example.Modulo.Tres.AtividadeSete.Produto("Mesa", 700.0, "Móveis")
        );

        List<Produto> produtosMaisBaratos = produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos"))
                .filter(p -> p.getPreco() < 1000)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(produtosMaisBaratos);
    }
}
