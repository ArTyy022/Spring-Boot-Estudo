package com.example.Modulo.Dois.AtividadeSeis;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> ordem = Arrays.asList("Gabriel", "Arthur" ,"Marcos", "Danilo", "Moisés" , "Kaillany");
        ordem.stream()
                .sorted()
                .forEach(System.out::println);

            }
        }


