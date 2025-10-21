package org.example.AtividadeTres;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Charlie", "Alice", "Bob");
        nomes.stream()
                .sorted()
                .collect(Collectors.joining());
        nomes.forEach(System.out::println);

    }
}
