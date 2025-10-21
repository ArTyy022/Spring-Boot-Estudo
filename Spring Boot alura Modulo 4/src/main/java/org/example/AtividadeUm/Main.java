package org.example.AtividadeUm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(20, 10, 50, 30, 40);
       Optional<Integer> maximo = numeros.stream()
                 .max(Integer::compare);
                maximo.ifPresent(System.out::println);
    }
    }


