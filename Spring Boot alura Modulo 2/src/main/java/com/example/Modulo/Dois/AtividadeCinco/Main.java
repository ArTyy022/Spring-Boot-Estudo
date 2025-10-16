package com.example.Modulo.Dois.AtividadeCinco;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);
    }
}

