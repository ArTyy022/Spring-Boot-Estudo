package com.example.Modulo.Dois.AtividadeTres;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("Escreva qualquer palavra em letra minúscula, para transforma-la em maiúscula");
            var palavra = leitura.nextLine();

            Letra toUpperCase = String::toUpperCase;
            System.out.println(toUpperCase.letra(palavra));
        }
    }

